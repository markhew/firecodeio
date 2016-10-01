// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Write a method findSpiral to traverse a 2D matrix 
of ints in a clockwise spiral order and append the elements to an output ArrayList if Integers.
*/

public static ArrayList<Integer> findSpiral(int[][] arr) {
    ArrayList<Integer> snake = new ArrayList<>();
    
    
    //Initializing variables used for spiraling
    //m: vertical height
    //n: horizontal length
    //start: the starting point for the spiral
    int m = arr.length;
    int n = arr[0].length;
    int start = 0;
    
    while (m > 0 && n > 0){
        //First two are to handle if there is only 1 row/col left in the 2D matrix
        if(m==1 ){
            for(int g=start;g<=n;g++){
                snake.add(arr[start][g]);
            }
        }
        else if(n==1){
            for(int h=start;h<=m;h++){
                snake.add(arr[h][start]);
            }
        }
        //Normal spiral execution 
        //else{
        else{
            for(int i=start;i<n-1;i++){
                snake.add(arr[start][i]);
            }
            for(int j=0;j<m-1;j++){
                snake.add(arr[j][n-1]);
            }
            for(int k=n-1;k>start;k--){
                snake.add(arr[m-1][k]);
            }
            for(int l=m-1;l>start;l--){
                snake.add(arr[l][start]);
            }
        }
        //Need to update variables 
        m-=2;
        n-=2;
        start++;
        
    }
    return snake;
    
    
}
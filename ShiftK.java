// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Rotate an array to the left by k positions without using extra space.k can be greater than the size of the array.
*/
public static int[] rotateLeft(int[] arr, int k) {
    //Get the number of shifts based on the size of the array;
    int numShifts = k % arr.length;
    //Reverse the array the entire array
    reverse(arr,0,arr.length-1);
    //Undo the reversal from the beginning of the array to index before where the original first element 
    //in the array should end
    reverse(arr,0,arr.length-1-numShifts);
    //Undo the reversal for the other part of the array
    reverse(arr,arr.length-numShifts,arr.length-1);
    return arr;
}


//Reverse an Array
public static void reverse(int[] arr, int left, int right){
    while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        left++;
        right--;
    }
}



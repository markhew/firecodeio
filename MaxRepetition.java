// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given an Array of integers, write a method that will return the integer with the maximum number of repetitions. Your code is expected to run with O(n) time complexity and O(1) space complexity. The elements in the array are between 0 to size(array) - 1 and the array will not be empty.
*/



public static int getMaxRepetition(int[] a) {
    int max = 0;
    //if there is only 1 element, return that 
    if(a.length == 1){
        return a[0];
    }
    //if there are only 2 elements, return the higher value if they are different
    else if(a.length == 2){
        return Math.max(a[0],a[1]);
    }
    //Otherwise, iterate through the elements in the array, and increment a[a[i]%k] by k, where k is size of the
    //array -1, return the index containing the highest index
    else{
        int k = a.length-1;
        for(int i=0;i<a.length;i++){
            a[a[i]%k] += k;
        }

        for(int i=0;i<a.length;i++){
            if(a[max] < a[i]){
                max = i;
            }

        }
    }
    return max;

    
}
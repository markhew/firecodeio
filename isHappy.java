// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Write a method to determine whether a postive number is Happy.

A number is Happy (Yes, it is a thing!) if it follows a sequence
that ends in 1 after following the steps given below : 
Beginning with the number itself, replace it by the sum of the squares of 
its digits until either the number becomes 1 or loops endlessly in a cycle that does not include 1.
*/
public static boolean isHappyNumber(int n) {
    //Store number in hashset for future reference
    HashSet<Integer> numbers = new HashSet<>();
    
    
    //Loop until the number returned is already in the hash set or 1
    while(!numbers.contains(n)){
        numbers.add(n);
        int newN = 0;
        int tmp = n;
        //getting each digit from n, adding the square of it to the sum
        while(tmp > 0 ){
            newN += Math.pow(tmp % 10, 2);
            tmp = tmp / 10;
        }
        
        //If the result is 1 then the input number is happy
        if(newN == 1){
            return true;
        }
        else{
            n = newN;
        }
        
        
    }
    //If the loop exits, the number was within the hashset of numbers (aka not happy)
    return false;




}
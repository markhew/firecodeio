// java.util.* has been imported for this problem.
// You don't need any other imports.
//Write a method to return all valid combinations of n-pairs of parentheses
//The method should return an ArrayList of strings, in which each string represents a valid combination of parentheses.


public static ArrayList<String> combParenthesis(int pairs) {
    ArrayList<String> pp = new ArrayList<>();
    
    //Only call recursive function if there is a positive number of pair requested
    if(pairs > 0){
        combParenthesisR(pairs,pairs,"",pp);
    }
    return pp;
}

//Recursive function 
//left: number of "(" that need adding
//right : number of ")" that need adding
//tmp: A variation of the combinations "()"s are added to 
//pp list of combinations are added to
public static void combParenthesisR(int left, int right, String tmp, ArrayList<String>pp){
    //only add tmp once no more "(" or ")" can be added
    if(left==0 && right == 0){
        pp.add(tmp);
    }
    else{
        //Add "C" to the current variation of the combinations for "()"
        if(left > 0){
            combParenthesisR(left-1,right,tmp+"(",pp);
        }
        //Add ")" to the current variation of the combinations for "()"
        if(right > left){//only add if there are "C" 
            combParenthesisR(left, right-1,tmp+")",pp);
        }
    }
    return;
}
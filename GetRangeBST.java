// java.util.* has been imported for this problem.
// You don't need any other imports.
/*Given a Binary Search Tree and two numbers - a & b, return all the nodes in the tree that lie 
in the range [a .. b]. Your method should return an ArrayList with the data of the qualifying nodes inserted 
in ascending order.
*/
public  ArrayList<Integer> rangeList = new ArrayList<Integer>();
public void printRange(TreeNode root, int a, int b) {
    //Call recursive function to add nodes to list
    getRange(root,a,b);
    Collections.sort(rangeList);
}

public void getRange(TreeNode root, int a, int b){
     //Only go through node if not null
    if(root != null){
        //Add node if data falls in range
        if(root.data >= a && root.data <= b){
            rangeList.add(root.data);
        }
        //If node data > lower range, traverse through left child
        if(root.data >= a){
            getRange(root.left,a,b);
        }
        //If node data > upper range, traverse through right child
        if(root.data <= b){
            getRange(root.right,a,b);
        }
        
    }  
}
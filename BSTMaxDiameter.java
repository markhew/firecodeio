// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given a BST, write a function to return its diameter.
The diameter of a Binary Tree is defined as the "Number of nodes on the longest path between two leaf nodes".

*/
public int diameter(TreeNode root) {
    return diameterAndHeight(root)[0];
}

public int[] diameterAndHeight(TreeNode root){
    //Initialize array to store both diameter and height
    int heightDiameter[] = {0,0};
    if(root != null){
        //If the node is not null get the height and diameter of its left and right children
        int[] left = diameterAndHeight(root.left);
		int[] right = diameterAndHeight(root.right);
        int leftDiameter = left[0];
        int rightDiameter = right[0];
        //Get the max(left,right) height and increment it by one
        int height = Math.max(left[1], right[1])+1;
        //Add the heights of both children to get the diameter with respect to the root
        int rootDiameter = left[1] + right[1] + 1;
        //Store the maximum of either the current diameter, the diameter of the left / right child 
        //as the max diameter
        int finalDiameter = Math.max(rootDiameter, Math.max(leftDiameter,rightDiameter));
        heightDiameter[0] = finalDiameter;
        heightDiameter[1] = height;
    }
    return heightDiameter;

}
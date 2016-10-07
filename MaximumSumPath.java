// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given a binary tree consisting of nodes with positive integer values, 
write a method - maxSumPath that returns the maximum sum of data values obtained by 
traversing nodes along a path between any 2 nodes of the tree. 
The path must originate and terminate at 2 different nodes of the tree, 
and the maximum sum is obtained by summing all the data values 
of the nodes traversed along this path.

*/
public static int maxSumPath(TreeNode root) {
    //Creating buffer to pass to helper method
    int[] maxHolder = new int[1];
    int x = maxSumPathMain(root, maxHolder);
    return maxHolder[0];
}

public static int maxSumPathMain(TreeNode root, int[] maxHolder){
    if(root == null){
        return 0;
    }
    //Get the sums of the left and right children
    int leftSum = maxSumPathMain(root.left, maxHolder);
    int rightSum = maxSumPathMain(root.right, maxHolder);
    //Computing the return value which is the value of the root + left / right sum    
    int nodeCumVal = root.data + Math.max(leftSum, rightSum);
    //Update maxHolder with maximum value found so far
    maxHolder[0] = Math.max(maxHolder[0],leftSum+root.data+rightSum);
    
    return nodeCumVal;
}
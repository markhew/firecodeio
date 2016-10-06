// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given two binary trees, determine if they are identical. If they are, return true otherwise return false.
*/
public boolean isIdentical(TreeNode root1, TreeNode root2) {
    if(root1 == null && root2 == null){//Check if both nodes are null
        return true;
    }
    if(root1 == null || root2 == null){//Check if only 1 is null
        return false;
    }
    //if check data of node, and recursively call isIdentical() for left and right children of both nodes
    return (root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);

}
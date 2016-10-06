// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given a
Binary Search Tree
, return the node with the maximum data.
*/
public TreeNode findMax(TreeNode root) {
    if(root == null){
        return null;         //return null if empty node (tree)
    }
    if(root.right == null){//If there are is right child, node contains max
        return root;
    }
    else{
        return findMax(root.right);//Go to right child
    }
    

    
}
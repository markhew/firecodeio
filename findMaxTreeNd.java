// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given a
Binary Search Tree, return the node with the maximum data.
*/
public TreeNode findMax(TreeNode root) {
    if(root == null){
        return null;         //return null if empty node (tree)
    }
    if(root.left == null && root.right == null){
        return root; //return node if leaf
    }
    
    //Setting variables to store left and right children if they exist
    int left = Integer.MIN_VALUE;
    int right = Integer.MIN_VALUE;
    
    if(root.left != null){
        left = root.left.data;
    }
    if(root.right != null){
        right = root.right.data;
    }
    //If the current node has the max, return the node 
    if(root.data > left && root.data > right){
        return root;
    }
    //if its either the left or right , recursively go into left and right
    else if(left  > root.data && left > right){
        return findMax(root.left);
    }
    else{
        return findMax(root.right);
    }
    

    
}
// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given a Binary Search Tree and an integer k, 
implement a method to find and return its kth largest node
*/
public TreeNode findKthLargest(TreeNode root, int k) {
    //If the tree/node is empty, return null
    if(root == null){
        return null;    
    }
    int rightSize = 0;
    
    //Get the size of the right subtree of the node(BST means right is bigger)
    if(root.right != null) {
        rightSize = size(root.right);
    }
    //If the size of the right subtree + 1 is equal to K, found the node
    if(rightSize+1 == k) { 
        return root;
    } 
    //If it is k <= the size of the right subtree, the recurse through the right child of the node
    else if(k <= rightSize) {
        return findKthLargest(root.right, k);
    }
    //Otherwise, recurse through the left child, decreasing k by the size of the right nodeapljs 1
    else {
        return findKthLargest(root.left, k-rightSize-1);
    }
    


}
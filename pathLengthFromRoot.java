// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given the root of a Binary Tree  and an integer that represents the data value of a TreeNode present in the tree, 
write a method - pathLengthFromRoot that returns the distance between the root and that node. You can assume that the given key exists in the tree. 
The distance is defined as the minimum number of nodes that must be traversed to reach the target node.

*/
public int pathLengthFromRoot(TreeNode root, int n1) {
    //If the node is null return 0
    if(root == null)return 0;
    int out = 0;
    //If the node data matches return 1, if not, recursively call children of node, incrementing return result by 1
    if((root.data == n1) || (out = pathLengthFromRoot(root.left, n1)) > 0 ||(out = pathLengthFromRoot(root.right, n1)) > 0 ){
        return out+1;
    }
    //In case data is not found in the entire tree.
    else{
        return 0;
    }
    
    
}
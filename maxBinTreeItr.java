//Write a method to find the maximum element in a binary tree iteratively
// java.util.* has been imported for this problem.
// You don't need any other imports.

public int findMaxItr(TreeNode root) {
    //Ensure there is no empty root
    if(root == null){
        return -1;
    }
    //Create a queue to store root for iterative traversal
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    TreeNode curr = root;
    
    //While the queue has elements, remove the first element, add the child switch
    //with the higher data value (dont add if parent is higher than existing children)
    while(!q.isEmpty()){
        curr = q.remove();
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        
        if(curr.left != null){
            left = curr.left.data;
        }
        if(curr.right != null){
            right = curr.right.data;
        }
        
        if(left > right && left > curr.data){
            q.add(curr.left);
        }
        else if(right > left && right > curr.data){
            q.add(curr.right);
        }
        
        
    }

    return curr.data;




}
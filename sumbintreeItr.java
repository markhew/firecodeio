// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given a binary tree, write a method to find and return the sum of all nodes of the tree iteratively.
*/
public int sumItr(TreeNode root) { 
    //Use queue to nodes for iterative
    
    Queue<TreeNode> q = new LinkedList<>();
    int sum = 0;
    //Store root initially(if its not null)
    if(root != null){
        q.add(root);
        //Each time remove 1 node from the Queue
        //Add its value to thetotal sum and add its children to the queue
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            sum+= curr.data;
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    
    return sum;



}
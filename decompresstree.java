// java.util.* has been imported for this problem.
// You don't need any other imports.

public TreeNode decompressTree(String str){
    //Return null if the string is null/""/*
    if(str==null || str.length() < 1 || str.equals("*"))return null;
    
    //Split the string into an array of strings, converting each element into an Integer or null (if *)
    //and adding them into an ArrayList
    String strs[] = str.split(",");
    ArrayList<Integer> iList = new ArrayList<>();

    for(int i=0;i <strs.length; i++){
        if(strs[i].equals("*")){
            iList.add(null);
        }
        else{
            iList.add(Integer.parseInt(strs[i]));
        }
    }
    
    TreeNode root = new TreeNode(iList.get(0),null,null);
    Queue<TreeNode> q = new LinkedList<>();
    TreeNode curr = root;
    boolean left = true;
    
    for(int i=1;i<iList.size();i++){
        //If the element is an integer, create a treenode from it, and add it as the left or right 
        //depending on left
       
        if(iList.get(i) != null){
            TreeNode node = new TreeNode(iList.get(i),null,null);
            if(left){
                curr.left = node;
            }
            else{
                curr.right = node;
            }
            q.add(node);
        }
        //Ensure that the next node is added to the right child of the current node
        if(left){
                left = false;
            }
            //or get the next node from the queue to add children for the current ones.
            else{
                left = true;
                //If the queue is empty, that means there can be no more nodes added anyway
                if(!q.isEmpty()){
                    curr = q.remove();
                }
                else{
                    return root;
                }
            }
        
       
        
    }
    
    return root;
}
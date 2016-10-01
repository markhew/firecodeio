// java.util.* has been imported for this problem.
// You don't need any other imports.
//Given a circular-linked list, write a function to delete its tail node and return the modified list's head.
public ListNode deleteAtTail(ListNode head) {
    
    //return null if there is less than 2 nodes
    if(head == null || head.next.equals(head)){
        return null;
    }

    ListNode n = head;
    //Traverse list until node reaches the 2nd last element
    while(!n.next.next.equals(head)){
        n = n.next;        
    }
    
    n.next = head;

    return head;

}
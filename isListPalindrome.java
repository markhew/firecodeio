// java.util.* has been imported for this problem.
// You don't need any other imports.
/*
Given a singly-linked list, write a method isListPalindrome to determine if the list is a palindrome. 
A palindrome is a sequence that reads the same backward as forward.
*/
public Boolean isListPalindrome(ListNode head) {
    //if list contains 1< element, return true
    if(head == null || head.next == null){
        return true;
    }  
    

    //Getting the mid node of the list
    ListNode slow = head;
    ListNode fast = head;
    ListNode secondH = null;//Pointer to start of second half
    while(fast.next != null && fast.next.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }
    //Determining if the list has an odd number of elements by checking if fast is null
    //If it is odd, need to not include the actual mid in the second half
    if(fast == null){
        secondH = slow;
    }
    else{
        secondH = slow.next;
    }
    
    //Reversing the second half
    ListNode next;
    ListNode prev = null;
    ListNode current = secondH;
    while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        
    }
    //Comparing first half (list starting from head) and second half(list starting from prev)
    ListNode n1 = head; 
    ListNode n2 = prev;//prev currently point to the original tail thanks to the reversal loop
    while(n2 != null){
        if(n1.data != n2.data){
            return false; // The moment one is different return false
        }
        n1 = n1.next;
        n2 = n2.next;
    }
    return true;
    


}
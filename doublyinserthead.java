public DoublyLinkedNode insertAtHead(DoublyLinkedNode head, int data) {
    //Create a new node with the data                
    DoublyLinkedNode newNd = new DoublyLinkedNode(data);
    //Return the new node if the list entered is empty
    if(head == null){
        return newNd;
    }
    
    //Make the current head.prev point to the newnd, newnd.next point to the current head
    //and return newNd as the new head
    head.prev = newNd;
    newNd.next = head;

    return newNd; 
    
}
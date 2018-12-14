package Lists;

public class DLList {
    DNode head;//create the head node;

   public void put(int data){
       DNode current = new DNode(data);//create a current;

       current.next = head;//point current next to head
       current.prev = null;//point current prev to null

       if(head != null){
           head.prev = current;
       }
       head = current;
   }
   public void after(DNode prev_node, int data){
       if(prev_node==null){
           System.out.println("MUST ENTER PREVIOUS NODe");
           return;
       }
       DNode current = new DNode(data);// create the current node

       current.next = prev_node.next;// assign previous node's next to current node's next

       prev_node.next = current; //assign current node as previous node's next

       current.prev = prev_node;// assign previous node current previous

       if(current.next != null){
           current.next.prev = current;
       }


       }
   public void app(int data){
       DNode last = head;// used for traversing to the last node//assigning head as last node

       DNode current = new DNode(data);// create the new node as current

       current.next = null; //assign the current next as null since we are appending

       if(head == null){
           current.prev = null;// make current previous as null and assign it as head
           current = head;
           return;
       }
       //traverse to the end of the list
       while (last.next!=null){
           last = last.next;
       }
       last.next = current;// point the last node to current
       current.prev = last;// assign last as current node's previous


   }
   public void printList(){
       if (head == null){
           System.out.println("Empty");
       }
       DNode temp = head;
       while (temp != null){
           System.out.println(temp.data +"-->");
           temp = temp.next;

       }
   }


}

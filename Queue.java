package Queues;

public class Queue {
    Node head;
    Node tail;

    public void IsEmpty(){
        if(head==null){
            return;
        }
    }
    public void peek(){
        if(head==null){
             System.out.println("Is empty");
        }
        System.out.println(head.data);

    }
    public void add(int data){
        Node current = new Node(data);

        if(head==null){
            head = current;
        }
        if(tail!= null){
            tail.next = current;
        }
        tail = current;
    }

    public void delete(){
        if (head==null){
            System.out.println("Nothing to delete");
        }
        int data = head.data;
        head.next= head;
        if (head==null){
            tail=null;
        }
        System.out.println(data);
    }
    public int last(){
        return tail.data;
    }
    public void print(){
        if(head==null){
            System.out.println("nothing is there");
        }
        while (head.next!=null){
            int data = head.data;
            System.out.println(data);
            head=head.next;
        }
        System.out.println(tail.data);
    }
}

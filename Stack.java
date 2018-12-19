package Stacks;

public class Stack {
    Node top;

    public boolean IsEmpty(){
        return top == null;
    }
    public void add(int data){
        Node current = new Node(data);
        current.next = top;
        top=current;
    }

    public void remove(){
        int data = top.data;
        top.next = top;
        System.out.println("removed"+data);;

    }
    public void print(){
        if(top==null){
            System.out.println("Empty");
        }
        while (top!=null){
            int data = top.data;
            top = top.next;
            System.out.println(data);
        }
        System.out.println(top.data);
    }
}

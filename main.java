package Stacks;

public class main {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add(45);
        s1.add(35);
        System.out.println(s1.IsEmpty());
        s1.print();
        s1.add(78);
        s1.add(563);
        //s1.print();

        s1.remove();
        s1.print();
    }

}

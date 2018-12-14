package Lists;

public class DMain {
    public static void main(String[] args) {
        DLList D1 = new DLList();
        D1.put(23);
        D1.put(45);

        D1.after(D1.head.next,95);
        D1.printList();


    }
}

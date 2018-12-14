package Collectionss;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //L1 is type specific
        ArrayList<String> L1 = new ArrayList<String>();
        //L2 is any type
        ArrayList L2 = new ArrayList();

        ListDemo obj1 = new ListDemo(35,"Reddy");

        //Adding elements in both the list
        L1.add("John");
        L1.add("Mariam");
        L1.add("Trinity");
        L1.add("Michel");
        L1.add("Raj");

        L2.add("Priya");
        L2.add("karan");
        L2.add(3.5);
        L2.add(45);
        L2.add(89023);
        L2.add(obj1);// you can even add an object in the list


        //Displaying items in the list
        System.out.println("Elements of List 1 :: "+L1);
        System.out.println("Elements of List 2 :: "+L2);

        // getting items of the list

        String p = L1.get(2);
        System.out.println("The name is "+ p);

        Object q = L2.get(5);// here we use Object is the parent of any type in Java - when we dont know the type
        System.out.println("The name is "+ q);

        // updating the list

        L1.set(2,"Brittney");
        L2.set(3,89);

        System.out.println("Updated list l1: "+ L1);
        System.out.println("Updated list l2: "+ L2 );

        // removing an element

        L1.remove(1);
        L2.remove(4);
        System.out.println("After removing an element from L1: "+L1);
        System.out.println("After removing element from L2: "+L2);

        //for loop to print the items
        System.out.println("======For loop======");
        for (int i=0; i < L2.size(); i++){
            System.out.println(L2.get(i));
        }
        //enhanced for loop
        System.out.println("====Enhanced for loop========");
        for(String str : L1){
            System.out.println(str);
        }
        System.out.println("====Iterator for L1========");
        //searching with equals
        Iterator<String> itr = L1.iterator();

        while( itr.hasNext()){
            String str = itr.next();
            System.out.println("-"+str);
        }
        System.out.println("=====Iterator for L2=======");
        Iterator itr2 = L2.iterator();

        while(itr2.hasNext()){
            Object r = itr2.next();
            System.out.println(r);
            if(r.equals(89)){
                itr2.remove();
            }
        }
        System.out.println("the final list L2 is: "+L2);
    }

}

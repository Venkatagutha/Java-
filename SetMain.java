package Collectionss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        //adding elements in the set
        set.add("Billy");
        set.add("Abra");
        set.add("zaha");
        set.add("liam");
        set.add("Brown");
        set.add("Billy");
        set.add("Billy");

        System.out.println("HashSet is unordered and takes no duplicates: "+set);

        Iterator<String> itr  = set.iterator();
        while(itr.hasNext())
        {
            String str = itr.next();
            System.out.println(str);


        }
        System.out.println("====Tree Set=====");
        TreeSet<String> set1 = new TreeSet<String>();

        set1.add("Abra");
        set1.add("Zak");
        set1.add("Jack");
        set1.add("jim");
        set1.add("Nelly");
        set1.add("Fanny");
        set1.add("Vanessa");
        set1.add("Zak");

        System.out.println("TreeSet stores in order: "+set1);

        System.out.println(set1.size());

        //set1.remove("Nelly");
        //if(set1.equals("Nelly")){
            //set1.remove("Nelly");
        //}
        System.out.println(set1);
        System.out.println(set1.size());

    }
}

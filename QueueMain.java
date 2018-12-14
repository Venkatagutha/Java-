package Collectionss;

import javax.naming.InsufficientResourcesException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        PriorityQueue<Integer> q =  new PriorityQueue<Integer>();
        Queue<Integer> q1 = new LinkedList<Integer>();

        for(int i = 0; i<10; i++){
            q1.add(i);
        }
        System.out.println("---"+q1);

        for (int i =20; i>10;i--){
            q.add(i);
        }
        System.out.println("--"+q);

        System.out.println(q.peek());
        System.out.println(q1.poll());
        System.out.println(q1);
    }
}

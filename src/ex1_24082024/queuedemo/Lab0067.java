package ex1_24082024.queuedemo;

import java.util.PriorityQueue;

public class Lab0067 {
    public static void main(String[] args) {

        //Queue : FIFO (First come first out)
        //No null values

        PriorityQueue pq = new PriorityQueue();
        pq.offer("11");
        pq.add("55");
        pq.offer("33");

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());
    }
}

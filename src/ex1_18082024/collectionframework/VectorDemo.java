package ex1_18082024.collectionframework;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        //vector is an arraylist with thread safety

        //Disadvantage - It is thread safe, Synchronized.. Time consuming, One by one useage, Slower
        Vector v = new Vector();
        v.add("Sajan");
        v.add("pramod");
        System.out.println(v);


    }
}

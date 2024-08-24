package ex1_18082024.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Collection - Interface
            //Collection (I) -> List (I)  (Interface)
            // List of elements, Can be duplicate
            // 1. List
                // ArrayList - Array
                // LinkedList _ Linked List - class - pre-class that you can use
                // Stack
                // vector (Legacy - Synchronized) Thread safe, Slow


//        List mylist = new ArrayList<>();
//        Collection mylist3 = new ArrayList<>();

        ArrayList mylist2 = new ArrayList();
        mylist2.add("Sajan");
        mylist2.add("Raj");
        System.out.println(mylist2);
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Sajan"));
        System.out.println(mylist2.get(1));

        System.out.println("--------------------------------------");

        List mylist3 = List.of("Milk", "Curd", "Egg");
        System.out.println(mylist3);
        System.out.println(mylist3.size());

        mylist3.set(3, "bread");
        mylist3.set(4, "Ragi");

        for(int i =0; i<mylist3.size();i++){
            System.out.println(mylist3.get(i));
        }

        for(Object o : mylist3){
            System.out.println(o);
        }

    }
}

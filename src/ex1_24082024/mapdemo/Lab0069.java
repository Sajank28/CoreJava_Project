package ex1_24082024.mapdemo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class Lab0069 {
    public static void main(String[] args) {

        Hashtable ht1 = new Hashtable();
        ht1.put(1,"One");
        ht1.put(2,"two");
        ht1.put(3,"three");

        System.out.println(ht1);

        Enumeration<Iterator> e = ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}

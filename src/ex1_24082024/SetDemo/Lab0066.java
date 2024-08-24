package ex1_24082024.SetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab0066 {
    public static void main(String[] args) {
        //TreeSet

        Set ts = new TreeSet(); //No duplicate
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");

        System.out.println(ts);

        System.out.println("---------------------------");

        for(Object s:ts){
            System.out.println(s);
        }

        System.out.println("---------------------------");

        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

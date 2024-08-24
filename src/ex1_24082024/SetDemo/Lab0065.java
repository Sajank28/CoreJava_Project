package ex1_24082024.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab0065 {
    public static void main(String[] args) {

        //Set doesnt allow duplicate

        Set hs = new HashSet();  // hashing mechanism to store the elements, No order
        hs.add("apple");
        hs.add("orange");
        hs.add("Wmelon");
        System.out.println(hs);

        Set lhs = new LinkedHashSet();  //Maintains order LinkedHashSet
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("Wmelon");
        System.out.println(lhs);
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());


    }
}

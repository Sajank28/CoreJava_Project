package ex1_24082024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab0064 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(122);
        marks.add(22);
        marks.add(55);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("Saj");
        names.add("Aash");
        names.add("Jenkin");

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
    }
}

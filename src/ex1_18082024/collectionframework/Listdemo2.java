package ex1_18082024.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Listdemo2 {
    public static void main(String[] args) {
        List <Integer> marks = new ArrayList<>();
        marks.add(100);
        marks.add(89);
        marks.add(55);

        //Print in list format
        System.out.println(marks);

        //print one by one
        for(Object o : marks){
            System.out.println(o);
        }
    }
}

package ex1_24082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab0063 {
    public static void main(String[] args) {
        //Store student name, id
        Student s1 = new Student(7, "Sajan");
        Student s2 = new Student(3, "Anauis");
        Student s3 = new Student(19, "zebra");

        List arraylist = new ArrayList();
        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        System.out.println(arraylist);
        Collections.sort(arraylist);
        System.out.println(arraylist);


//        LinkedList lr = new LinkedList();
//        lr.add(s1);
//        System.out.println(lr);
    }
}

class Student implements Comparable<Student>{

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private Integer id;
    private String name;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }
}

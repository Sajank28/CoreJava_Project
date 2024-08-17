package ex1_17082024.exceptionsdemo;

import java.io.FileInputStream;

public class Lab0057 {
    public static void main(String[] args) {
        //Checked - JVM Knows
        try {
            FileInputStream file = new FileInputStream("c://log.txt");
        }catch(Exception e){
            System.out.println("Error! File not found");
            System.out.println(e.getMessage());
        }

        //unchecked
        int a =10;
        try {
            int b = a / 0;  //arithmetic exception
            System.out.println(b);
        }catch (Exception e){
            System.out.println("Arithmetic Exception found");
            System.out.println(e.getMessage());
        }
    }
}

package ex_27072024;

import java.util.Scanner;

public class Lab0033 {
    public static void main(String[] args) {
        //Disadvantages of array
            // Fixed length
            // fixed data type
            // wastage of memory

        Scanner sc= new Scanner(System.in);
        int marks[] = new int[4];
        for(int i = 0; i<marks.length;i++){
            System.out.print("Enter marks of subject "+ (i+1)+ " = ");
            sc.nextInt();
        }

    }
}

package ex_20072024;

import java.util.Scanner;

public class Lab0022 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Char : ");
        char input = sc.next().charAt(0);

        switch (input) {
            //Latest Java >13 update
//            case 'a','e','i','o','u':
//                System.out.println("Vowel");
//                break;

            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Invalid input");


        }
    }
}

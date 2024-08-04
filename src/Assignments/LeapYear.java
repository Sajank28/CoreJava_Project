package Assignments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Leap year (year with 366 days)
        // divisible by 4
        // but not by 100, divisible by 400

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if (year % 4 == 0 && (year%  100 != 0 || year % 400 == 0)){
            System.out.println("Its a leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}



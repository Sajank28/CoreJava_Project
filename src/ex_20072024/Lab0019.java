package ex_20072024;

import java.util.Scanner;

public class Lab0019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Num2 : ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1+ " is Greater");
        }else if(num2 > num1) {
            System.out.println(num2 + " is Greater");
        }else{
            System.out.println("Equal");
        }

//        System.out.println("Max num : "+Math.max(num1,num2));
//        System.out.println("Min Num : "+ Math.min(num1,num2));
    }
}

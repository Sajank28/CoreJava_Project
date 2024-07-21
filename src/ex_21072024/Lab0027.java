package ex_21072024;
//LAB131
import java.util.Scanner;

public class Lab0027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int n = sc.nextInt();


        // Factorial of a number
        int fact = 1;
        for (int i = 0; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }

}

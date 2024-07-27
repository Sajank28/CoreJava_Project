package Assignments;

import java.util.Arrays;

public class secondHighestSalary {
    public static void main(String[] args) {
        int salaries[] = {55,132,56,99,214,44};

        int max= salaries[0];

        for(int i =0; i<salaries.length;i++){
            if(salaries[i] > max){
                max = salaries[i] ;

            }
        }
        System.out.println(max);

        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-2]);

    }
}

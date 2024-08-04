package Assignments;

import java.util.Arrays;

public class secondHighestSalary {
    public static void main(String[] args) {
        int salaries[] = {55,12,56,99,214,41};

        int max= salaries[0];

        for(int i =0; i<(salaries.length)-2;i++){
            if(salaries[i] > max){
                max = salaries[i] ;

            }
        }
        System.out.println(max);

        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-2]);

    }
}

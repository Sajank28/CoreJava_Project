package ex_27072024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab0034 {
    public static void main(String[] args) {

        //find max salary
        int [] salaries = {7,10,4,55,78,2,33};
        int max=1;
        int min = salaries[0];

        for(int i=0;i<salaries.length;i++){
            if(salaries[i]>max){
                max = salaries[i];
            }
            if(min > salaries[i]){
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        //shortcut for max
        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);

        //shortcut for min
        Arrays.sort(salaries);
        System.out.println(salaries[0]);
    }
}

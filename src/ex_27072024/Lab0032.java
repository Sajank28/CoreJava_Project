package ex_27072024;

public class Lab0032 {
    public static void main(String[] args) {

        int[] marks = new int[4];
        marks[0]=90;
        marks[1]=88;
        marks[2]=99;
        marks[3]=17;
        for(int i=0; i<marks.length;i++){
            System.out.println("marks of index "+ i+ " is " + marks[i]);

        }

        //or
        System.out.println("------------------------");

        String weekdays [] = {"sunday", "monday","Tuesday"};
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }



    }
}

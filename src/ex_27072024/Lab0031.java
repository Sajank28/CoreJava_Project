package ex_27072024;

public class Lab0031 {
    public static void main(String[] args) {
    //Array
        //Collection of same data type
        //Stored in contigious memory location |0|1|2|3|
        //Elements are fixed.

        //How to use arrays
            //1. Declaring and initialising arrayname
            //DataType [] arrname;

        int[] marks = {90,99,100,79,77};
        int a =  marks[1];
        int b = marks[0];
        int c= marks[3];

        System.out.println(a); //99
//        System.out.println(marks[10]); //ArrayIndexOutOfBound
        System.out.println(marks.length); //5

        //2. create object
        int[] array = new int[3];
        array[0] = 5;
        array[1] = 7;
        System.out.println(array[0]);
        System.out.println(array[1]);

    }
}

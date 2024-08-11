package ex1_10082024.poly.overloading;

public class Lab0046 {
    public static void main(String[] args) {

        MathOp0046 operation = new MathOp0046();

        //1. Method Overloading - one or more methods with same name diff args
        System.out.println(operation.add(5,10));  //int

        System.out.println(operation.add(4.5,9.8)); //double

        System.out.println(operation.add("15","20")); //String


    }
}

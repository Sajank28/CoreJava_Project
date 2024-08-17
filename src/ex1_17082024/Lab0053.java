package ex1_17082024;

public class Lab0053 {
    public static void main(String[] args) {
        System.out.println("Primitive to wrapper class");
        int a =10;
        Integer b = a;
        System.out.println(a);
        System.out.println(b.equals(10));


        System.out.println("Wrapper to Primitive");
        Integer a2 = 42; //Auto Boxing = int -> Integer
        int value = a2;  //Unboxing = Integer -> int
        System.out.println(a2);
        System.out.println(value);


        System.out.println("String to int");
        String num = "10";
        Integer a3 = Integer.valueOf(num);
        System.out.println(a3);
    }
}

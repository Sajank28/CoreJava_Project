package ex_14072024;

public class Lab009 {
    public static void main(String[] args) {

        //Type Casting
            // 1. Widening
            byte b =10;
            int i = (int)b; // or int i = b; VALID -Implicit casting - JVM
            System.out.println(b);
            System.out.println(i);

            //2. Narrowing
            int val =456;
            byte b1= (byte)val; // INVALID -Explicit casting - loss of data
            System.out.println(val);
            System.out.println(b1);
    }
}

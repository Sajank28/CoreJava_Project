package ex_14072024;

public class Lab010 {
    public static void main(String[] args) {
        //Increment & Decrement Op ++, --
        // pre and post

            //Pre - Increment ++a
            int a =10;
            int b = ++a;
            System.out.println(a);
            System.out.println(b);

        System.out.println("-----------------------------------");

            //Post - Increment ++a
            int a1 =10;
            int b1 = a1++;
            System.out.println(a1);
            System.out.println(b1);

        //System.out.println(++a + a++ + a++ );
        // a=10; ++a = 11, a++= 11 , a++ = 12   11+11+12 = 34

    }
}

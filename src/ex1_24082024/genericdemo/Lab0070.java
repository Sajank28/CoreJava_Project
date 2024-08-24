package ex1_24082024.genericdemo;

public class Lab0070 {
    public static void main(String[] args) {
        //Generic - allows reuse-ability of code

        // T -> ref name for Any DataType
        temp("Pramod");
        temp(123);
        temp(true);

        sum(3,4);
        sum("saj","raj");

    }

    public static <T> T sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <T> void temp (T name){
        System.out.println(name);
    }
}

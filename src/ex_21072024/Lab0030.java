package ex_21072024;

//Lab135
public class Lab0030 {
    public static void main(String[] args) {

        //Functions
        /*
        1. Define
        2. Call the function
         */

        function_type1();

        String name = function_type2();
        System.out.println(name);

        function_type3("Amit");
        function_type3("123");

        int sun = function_type4(4,5);
        System.out.println(sum);
        //Types of Functions

        //1. without param and without return type
        static void function_type1(){
            System.out.println("without param and without return type");
        }
        //2. without param and with return type
        static String function_type2(){
            System.out.println("without param and without return type");
            return "Sajan";
        }

        //3. with param and without return type
        static void function_type3(String name){
            System.out.println("without param and without return type");
        }
        //4. with param and with return type
        static int function_type4 (int a, int b){
            System.out.println("without param and without return type");
            return a+b;
        }

    }
}

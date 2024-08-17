package ex1_17082024.exceptionsdemo;

public class Lab0056 {

    //exceptions - Event that occurs during the execution of a program that disrupts normal flow of instructions.
    //Object -> Throwable
                // 1. Error
                    // ThreadDeath | virtual machine error | IO Error
                // 2. Exception
                    //Checked - JVM Knows
                        // ClassNotFoundException | InstantationException | IllegalAccessException |
                    //Unchecked
                        // ArithmeticException



    public static void main(String[] args) {
        String ip = args[0];
        System.out.println(ip);
    }
}

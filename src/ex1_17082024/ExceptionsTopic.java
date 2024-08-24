package ex1_17082024;

public class ExceptionsTopic {
    //exceptions - Event that occurs during the execution of a program that disrupts normal flow of instructions.
    //Object -> Throwable
            // 1. Error
                // ThreadDeath | virtual machine error | IO Error
            // 2. Exception
                //Checked - JVM Knows - CompileTimeException
                    // ClassNotFoundException | InstantiationException | IllegalAccessException | IOException
                //Unchecked - RunTimeException
                    // ArithmeticException | Null Pointer | ArrayIndexOutOfBound

    //How to handle Exception
        //1. Try and Catch
            //1. Try and Catch Block
            //2. Try and Multiple catch
            //3. Try and catch and Finally
            // Finally -> Block of code which will be executed anyhow
            // Purpose -> Closing of connections -> SQL, FILE, Scanner etc
        //2. Throws
            // It can also be used to handle the exception
            // attaches itself to method signature. Rather than attaching to vulnerable code
}

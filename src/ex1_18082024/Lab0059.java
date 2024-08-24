package ex1_18082024;

public class Lab0059 {

    // Exception Passing Concept
        //
    public static void main(String[] args) {
        extracted();
    }
    private static void extracted(){
        extracted1();
    }

    private static void extracted1(){
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]); //unchecked - ArrayOutOfBoundIndex
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of program");
        }
    }
}

package ex1_17082024;

public class Lab0054 {
    public static void main(String[] args) {
        ApiAutomation A = new ApiAutomation();
    }

    static class ApiAutomation{
        static{
            System.out.println("Loaded data from sql"); // called by ApiAutomation  - SIB
        }
       {
            System.out.println("Loaded data from CSV"); // Called by new ApiAutomation() - IIB
        }
    }
}

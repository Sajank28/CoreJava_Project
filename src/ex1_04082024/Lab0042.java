package ex1_04082024;

public class Lab0042 {
    public static void main(String[] args) {
        BankDetails0042 bank = new BankDetails0042("SBI", "007856", 56000);
        bank.printDetails();

        System.out.println("----------------------------------");

        BankDetails0042 bank2 = new BankDetails0042("ICIC", 100000);
        bank2.printDetails();
    }
}

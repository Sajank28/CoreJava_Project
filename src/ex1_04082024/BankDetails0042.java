package ex1_04082024;

public class BankDetails0042 {
    String bankName;
    String bankCode;
    int balance;

    BankDetails0042(String bName, String bCode, int bal){
        this.bankName = bName;
        this.bankCode = bCode;
        this.balance = bal;
    }

    BankDetails0042(String bName,int bal){
        this.bankName = bName;
        this.balance = bal;
    }

    void printDetails(){
        System.out.println("Bank Name : "+bankName);
        System.out.println("Bank Code : "+bankCode);
        System.out.println("Balance : "+balance);

    }
}

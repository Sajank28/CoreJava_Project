package ex_20072024;

public class Lab0017 {
    public static void main(String[] args) {
        //Conditions
            // 1) IF
                int age = 24;
                int day = 4;
                if(age >= 18){
                    System.out.println("Eligible to vote");
                }else {
                    System.out.println("Not eligible");
                }

            // 2) Switch
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid Day");
        }

    }
}

package ex_28072024;

public class Lab0036 {
    public static void main(String[] args) {
        //Object-Oriented Programming Language (OOPs Concept)
                // Design a program using class n objects
        //Class -
        // Objects -
            //Real life problems
                //Abstraction -
                //Encapsulation -
                //Polymorphism - many forms
                //

        // className clas ref = new className();
        Person0036 p = new Person0036();

        if(p.gender.equalsIgnoreCase("Male") ){
            p.walk();
        }else if (p.gender.equalsIgnoreCase("Female")){
            p.talk();
        }else{
            System.out.println("Not valid response");
        }

    }
}

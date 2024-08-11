package ex1_10082024.poly.superdemo;

public class Lab0048 {
    //Super - a subclass to refer its parent class
        //1. Use of super with var
        //2. use of super with methods
        //3. use of super with constructors

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }

}
class Car extends vehicle{
    private int maxspeed = 290;

    void display(){
        System.out.println("car speed is : "+this.maxspeed); // child - Car
        System.out.println("car speed is : "+super.maxspeed); //parent - Vehicle
    }
}

class vehicle{
    public int maxspeed = 180;


    void message(){
        System.out.println("Hello vehicle");
    }
}

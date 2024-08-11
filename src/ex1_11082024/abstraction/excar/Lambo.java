package ex1_11082024.abstraction.excar;

public class Lambo extends Car {
    void drive(){
        System.out.println("***********");
        System.out.println("Lambo");
        System.out.println("***********");
        openCar();
        start();
        partGearBox();
        speed(280);
        stop();
    }
}

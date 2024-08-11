package ex1_11082024.abstraction.excar;

public class Tesla extends Car{
    void drive(){
        System.out.println("**************");
        System.out.println("Tesla Car");
        System.out.println("**************");
        openCar();
        start();
        partGearBox();
        speed(190);
        stop();
    }
}

package ex1_11082024.abstraction.excar;

public class Car extends Engine {
    //engine
    //gearbox
    //keys

    @Override
    void openCar() {
        System.out.println("Open Car");
    }

    @Override
    void partGearBox() {
        System.out.println("part of gearbox");
    }

    @Override
    int speed(int a) {
        System.out.println("Speed : "+a);
        return a;
    }

    @Override
    void stop() {

        System.out.println("Stop a car");
    }

    @Override
    void start() {
        System.out.println("Start a car");
    }
}

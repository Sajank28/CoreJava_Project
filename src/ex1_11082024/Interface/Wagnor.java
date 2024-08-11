package ex1_11082024.Interface;

public class Wagnor implements Engine{

    void drive()
    {
        startEngine();
        stopEngine();
    }


    @Override
    public void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping car");

    }
}

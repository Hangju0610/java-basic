package poly.car1;

public class AvanteCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("AvanteCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("AvanteCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("AvanteCar.pressAccelerator");
    }
}

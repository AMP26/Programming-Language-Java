package OOPs.Polymorphism.runtime;

public class Car extends Bike{
    @Override
    public String name() {
        return "Car";
    }

    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public void gear() {
        System.out.println("It has 5 gears.");
    }

    @Override
    public void avgSpeed() {
        System.out.println("It has an average speed of 80 km/h.");
    }
}

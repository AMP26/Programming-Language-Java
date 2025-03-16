package OOPs.Polymorphism.runtime;

public class Bike implements Automobile {
    @Override
    public String name() {
        return "Bike";
    }

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public void gear() {
        System.out.println("It has 5 gears.");
    }

    @Override
    public void avgSpeed() {
        System.out.println("It has an average speed of 60 km/h.");
    }
}

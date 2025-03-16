package OOPs.Polymorphism.runtime;

public class AutoTempo implements Automobile {
    @Override
    public String name() {
        return "Auto Tempo";
    }

    @Override
    public int wheels() {
        return 3;
    }

    @Override
    public void gear() {
        System.out.println("It has 4 gears.");
    }

    @Override
    public void avgSpeed() {
        System.out.println("It has an average speed of 50 km/h.");
    }
}

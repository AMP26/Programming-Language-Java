package OOPs.Polymorphism.runtime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle information:");

        Automobile auto = new AutoTempo();
        System.out.println("Name: " + auto.name());
        System.out.println("No. of wheels: " + auto.wheels());
        auto.gear();
        auto.avgSpeed();

        System.out.println();

        Bike bike = new Bike();
        System.out.println("Name: " + bike.name());
        System.out.println("No. of wheels: " + bike.wheels());
        bike.gear();
        bike.avgSpeed();

        System.out.println();

        Car car = new Car();
        System.out.println("Name: " + car.name());
        System.out.println("No. of wheels: " + car.wheels());
        car.gear();
        car.avgSpeed();
    }
}

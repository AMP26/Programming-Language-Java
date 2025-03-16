package OOPs.Interface.vehicles;

import OOPs.Interface.properties.Engine;
import OOPs.Interface.properties.Info;
import OOPs.Interface.properties.Vehicle;

public class Nexon extends Info implements Vehicle, Engine
{
    private String engineType, colour, fuelType, name;
    private int wheels, gears, seats, topSpeed;

    public Nexon() {}

    public Nexon(String name, String engineType, String colour, String fuelType, int wheels, int gears, int seats, int topSpeed)
    {
        this.name = name;
        this.engineType = engineType;
        this.colour = colour;
        this.wheels = wheels;
        this.gears = gears;
        this.seats = seats;
        this.topSpeed = topSpeed;
        this.fuelType = fuelType;
    }

    public String vehicleName() { return this.name; }
    @Override
    public String engineType() { return this.engineType; }

    @Override
    public int wheels() { return this.wheels; }

    @Override
    public String colour() { return this.colour; }

    @Override
    public int gears() { return this.gears; }

    @Override
    public String fuelType() { return this.fuelType; }

    public int topSpeed() { return this.topSpeed; }

    public int seats() { return this.seats; }

    @Override
    public String toString() {
        return  "\nName: " + name +
                "\nEngine Type: " + engineType +
                "\nColour: " + colour +
                "\nFuel Type: " + fuelType +
                "\nWheels: " + wheels +
                "\nGears: " + gears +
                "\nSeats: " + seats +
                "\nTop Speed: " + topSpeed;
    }
}


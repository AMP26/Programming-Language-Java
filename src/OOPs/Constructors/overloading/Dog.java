package OOPs.Constructors.overloading;

public class Dog {
    public Dog() { System.out.println("I am a B."); }

    private String name;
    private int legs;
    public Dog( String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void getName() { System.out.println("Name: " + this.name); }

    public void getLegs() { System.out.println("Legs: " + this.legs); }
}

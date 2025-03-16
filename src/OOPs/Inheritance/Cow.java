package OOPs.Inheritance;

public class Cow extends Animals {
    private int legs;
    private String sound;

    public Cow() {}

    public Cow(int legs, String sound) {
        this.legs = legs;
        this.sound = sound;
    }

    @Override
    public int legs() { return this.legs; }

    @Override
    public void foodConsumption() {  System.out.println("Herbivore. "); }

    @Override
    public void type(){System.out.println("Mammal. ");}

    @Override
    public String sound() { return this.sound; }
}

package OOPs.Inheritance;

public class Kiwi  extends Animals
{
    private int legs;
    private String sound;

    public Kiwi() {}

    public Kiwi(int legs, String sound) {
        this.legs = legs;
        this.sound = sound;
    }

    @Override
    public int legs() { return this.legs; }

    @Override
    public void foodConsumption() {  System.out.println("Herbivore. "); }

    @Override
    public void type(){System.out.println("Bird. ");}

    @Override
    public String sound() { return this.sound; }

    public void tail() { System.out.println("No tail. "); }

}

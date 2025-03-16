package OOPs.Inheritance;

public class Animals {
    // Properties
    public int legs() {
        System.out.println("As animals is an abstract topic so number of legs are not defined.");
        return 0;
    }

    public void foodConsumption() {
        System.out.println("Animals can be herbivores, carnivores or omnivores.");
    }

    public void type() {
        System.out.println("Animals cane be amphibians, birds, fishes, mammals and reptiles.");
    }

    public String sound() {
        System.out.println("As animals is an abstract topic so sound is not defined.");
        return null;
    }
}
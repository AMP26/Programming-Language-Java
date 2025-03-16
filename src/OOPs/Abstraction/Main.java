package OOPs.Abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Characteristics of a man:");
        Human m = new Man();
        m.gender();
        m.tone();
        m.sleep();

        System.out.println();

        System.out.println("Characteristics of a woman:");
        Woman w = new Woman();
        w.gender();
        w.tone();
        w.sleep();
    }
}
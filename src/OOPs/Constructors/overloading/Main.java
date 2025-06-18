package OOPs.Constructors.overloading;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println("B info: ");
        Dog dog1 = new Dog("Pinto", 4);
        dog1.getName();
        dog1.getLegs();
    }
}

package NormalOrRegular.AccessingInnerClassFromOutsideOfOuterClass;

public class Main {
    public static void main(String[] args) {
        // Same as accessing from static region.
        Car.Engine e = new Car().new Engine();
        e.start();
    }
}

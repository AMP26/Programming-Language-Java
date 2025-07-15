package NormalOrRegular.AccessingInnerClassFromInstanceRegionOfOuterClass;

public class Car {
    class Engine /* Car$Engine */ {
        // Inner classes cannot have static declarations. Hence, main() can't be declared here.
        // Inner classes cannot be invoked directly.
        public void start() {
            System.out.println("Innerclass method start() accessed.");
        }
    }

    public static void main(String[] args) {
        Car.Engine e = new Car().new Engine();
        e.start();
    }
}

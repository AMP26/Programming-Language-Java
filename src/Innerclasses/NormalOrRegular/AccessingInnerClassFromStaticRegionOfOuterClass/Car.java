package NormalOrRegular.AccessingInnerClassFromStaticRegionOfOuterClass;
public class Car {
    class Engine /* Car$Engine */ {
        // Inner classes cannot have static declarations. Hence, main() can't be declared here.
        // Inner classes cannot be invoked directly.
        public void start() {
            System.out.println("Innerclass method start() accessed.");
        }
    }

    public void callEngine() {
        System.out.println("Invoke start() from Innerclass: Engine");
        Engine e = new Engine();
        e.start();
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.callEngine();
    }
}

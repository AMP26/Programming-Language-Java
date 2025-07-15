package NormalOrRegular.AccessingInnerClassFromOutsideOfOuterClass;
public class Car {
    class Engine /* Car$Engine */ {
        // Inner classes cannot have static declarations. Hence, main() can't be declared here.
        // Inner classes cannot be invoked directly.
        public void start() {
            System.out.println("Innerclass method start() accessed.");
        }
    }
}

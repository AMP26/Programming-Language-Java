package OOPs.Coupling.tightcoupling;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine; // Car is no longer responsible for creating the Engine
    }

    public void start() {
        engine.start();
    }
}

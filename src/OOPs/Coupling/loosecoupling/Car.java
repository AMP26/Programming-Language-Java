package OOPs.Coupling.loosecoupling;

public class Car {
    private Engine engine;

    public Car(){
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
    }
}

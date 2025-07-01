package experiments.runmethod.overloadedrunmethod;

public class Main {
    public static void main(String[] args) {
        NewDemoThread t = new NewDemoThread();
        t.start(); // start() will always run the no-arg run method.

        t.run(10); // This run() will run as a normal method

            System.out.println("Main Thread");
    }
}

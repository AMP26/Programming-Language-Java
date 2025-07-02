package experiments.startmethod.anotherwayofstartmethod;

public class Main {
    public static void main(String[] args) {
        NewDemoThread t = new NewDemoThread();
        // Not recommended
        t.start(); // start() is being overridden, so it will run as normal method. No new thread wll be created.

        System.out.println("Main Thread");
    }
}


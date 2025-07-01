package experiments.runmethod.runasnormalmethod;

public class Main {
    public static void main(String[] args) {
        NewDemoThread t = new NewDemoThread();
        t.run();// This will run as normal method. A separate new thread won't be created.

        for(int  i = 0; i < 5; i++)
            System.out.println("Main Thread");

        // Output will always "Child Thread" followed by "Main Thread". This total output is only produced by main thread.
    }
}

package experiments.startmethod.runningstartmethodagain;

public class Main {
    public static void main(String[] args) {
        NewDemoThread t = new NewDemoThread();
        t.start();
        t.start();

        // Once a thread is started then it cannot be started again. It will give IllegalThreadStateException.

        System.out.println("Main Thread");
    }
}


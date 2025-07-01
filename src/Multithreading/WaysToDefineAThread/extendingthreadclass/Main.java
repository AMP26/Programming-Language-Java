package extendingthreadclass;

public class Main {
    public static void main(String[] args) {
        DemoThread t = new DemoThread();
        t.start(); // Without executing start() method there is no chance of starting a thread.

        Thread t3 = new Thread() {
          public void run() {
              for( int i = 0; i < 6; i++)
              System.out.println("Thread Anonymous Class");
          }
        };

        t3.start();

        for(int i = 0; i < 5; i++)
            System.out.println("Main Thread");
    }
}
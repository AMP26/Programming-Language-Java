package Anonymous;

public class DemoThread implements Runnable {
    public void run() {
        for(int i = 10; i < 21; i++)
            System.out.println("Number: " + i);
        }
    }

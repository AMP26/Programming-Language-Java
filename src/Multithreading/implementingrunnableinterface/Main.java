package implementingrunnableinterface;

public class Main {
    public static void main(String[] args) {

        DemoRunnable r = new DemoRunnable();
        Thread t = new Thread(r);
        t.start();

        Runnable r2 = new Runnable() {
            public void run() {
                for(int i = 0; i < 10; i++)
                    System.out.println("Anonymous Class");
            }
        };
        Thread t1 = new Thread(r2);
        t1.start();

        for(int i = 0; i < 5; i++)
            System.out.println("Main Thread");
    }
}
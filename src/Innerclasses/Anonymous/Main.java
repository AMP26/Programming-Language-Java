package Anonymous;

public class Main {
    public static void main(String[] args) {
        // Anonymous class extends Thread class and Thread() is child class object
        Runnable r = new Runnable() /* Anonymous.Main$1 */ {
            public void run() {
                for (int i = 0; i < 10; i++)
                    System.out.println("First Thread!");
            }
        };
        Thread t = new Thread(r);
        t.start();
        Thread d = new Thread() /* Anonymous.Main$2.class */ {
            public void run() {
                for(int i = 0; i < 10; i++)
                    System.out.println("Second Thread!");
            }
        };
        d.start();

        System.out.println("First Thread Name: " + r.getClass().getName());
        System.out.println("Second Thread Name: " + d.getClass().getName());
    }
}

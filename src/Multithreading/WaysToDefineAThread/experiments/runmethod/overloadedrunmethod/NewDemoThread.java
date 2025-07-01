package experiments.runmethod.overloadedrunmethod;

public class NewDemoThread extends Thread {
        public void run() {
            System.out.println("No-arg run method");
        }

        public void run(int i) {
            System.out.println("int-arg run method");
        }
}

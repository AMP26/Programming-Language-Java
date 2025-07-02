package experiments.startmethod.anotherwayofstartmethod;

public class NewDemoThread extends Thread {

    public void start(){
        super.start();
        System.out.println("normal start method executed");
    }
    public void run() {
        System.out.println("Child Thread");
    }
}

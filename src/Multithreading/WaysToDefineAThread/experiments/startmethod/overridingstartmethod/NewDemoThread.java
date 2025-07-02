package experiments.startmethod.overridingstartmethod;

public class NewDemoThread extends Thread {

    public void start(){
        System.out.println("normal start method executed");
    }
    public void run() {
        System.out.println("run method");
    }
}

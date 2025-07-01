package experiments.runmethod.notoverridingrun;

public class Main {
    public static void main(String[] args) {
        NewDemoThread t = new NewDemoThread();
        t.start();

        // It is recommended to override run method otherwise don't go for multi-threading concept.
        // There won't be any out put when this program will run.
    }
}

package OOPs.Abstraction;

public class Man extends Human {

    @Override
    public void gender() {
        System.out.println("Gender: Male");
    }

    @Override
    public void tone() { System.out.println("Tone: Low Pitch."); }
}

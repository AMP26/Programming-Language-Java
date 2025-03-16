package OOPs.Inheritance;

public class Main {
        public static void main(String[] args)
        {
            System.out.println("Characteristics of a Cow:");
            Animals cow = new Cow(4, "Moo");
            System.out.println("Legs: " + cow.legs() + "." + "\n" + "Sound: " + cow.sound() + ".");
            cow.foodConsumption();
            cow.type();

            System.out.println("\n" + "Characteristics of a Frog:");
            Animals frog = new Frog(2,"Ribbit");
            System.out.println("Legs: " + ((Frog) frog).getLegs() + "." + "\n" + "Sound: " + ((Frog) frog).sound() + ".");
            frog.foodConsumption();
            frog.type();

            System.out.println("\n" + "Characteristics of a Kiwi:");
            Kiwi kiwi = new Kiwi(2,"Pukeko");
            System.out.println("Legs: " + kiwi.legs() + "." + "\n" + "Sound: " + kiwi.sound() + ".");
            kiwi.foodConsumption();
            kiwi.type();
            kiwi.tail();
        }
    }
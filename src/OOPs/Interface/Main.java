package OOPs.Interface;

import OOPs.Interface.vehicles.Nexon;

public class Main {
    public static void main(String[] args) {
        Nexon nex = new Nexon("Nexon", "BSVI", "Black", "Petrol", 4, 6, 5, 220);

        System.out.println("Full Information: " + nex.toString());
    }
}
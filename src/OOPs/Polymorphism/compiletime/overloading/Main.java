package OOPs.Polymorphism.compiletime.overloading;

public class Main {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        System.out.println("Adding two integers: " + num.addNum(10,20));

        System.out.println("\nAdding three integers: " + num.addNum(10,20,30));

        System.out.println("\nAdding two double values: " + num.addNum(50.0d, 30.0d));

        System.out.println("\nAdding two float values: " + num.addNum(50.5f, 30.5f));

        // Below num.addNum(100l, 200l) will go to public float addNum(float num1, float num2)
        // char -> int -> long -> float -> double (Automatic promotion in overloading)
        System.out.println("\nAdding two long values: " + num.addNum(100l, 200l));
    }
}

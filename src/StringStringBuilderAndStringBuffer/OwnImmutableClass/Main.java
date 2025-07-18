package OwnImmutableClass;
public class Main {
    public static void main(String[] args) {
        Imut t = new Imut(400);
        Imut num1 = t.modify(900);
        Imut num2 = t.modify(400);

        // num1 value is different so new object created result is false
        System.out.println("Result of t == num1: " + (t == num1));

        // t & num2 Pointing to  same object so true
        System.out.println("Result of t == num2: " + (t == num2));
    }
}

package operators;

public class Operators {

    public void arithmeticOperators() {
        int a = 11, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: a + b = " + (a + b));
        System.out.println("Subtraction: a - b = " + (a - b));
        System.out.println("Multiplication: a * b = " + (a * b));
        System.out.println("Division: a / b = " + (a / b));
        System.out.println("Modulus: a % b = " + (a % b));
    }

    public void relationalOperators() {
        int a = 11, b = 5;
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    public void logicalOperators() {
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }

    public void bitwiseOperators() {
        int a = 60; // 0011 1100
        int b = 13; // 0000 1101
        int result;

        System.out.println("\nBitwise Operators:");
        result = a & b;
        System.out.println("a & b = " + result);  // 12
        result = a | b;
        System.out.println("a | b = " + result);  // 61
        result = a ^ b;
        System.out.println("a ^ b = " + result);  // 49
        result = ~a;
        System.out.println("~a = " + result);     // -61
        result = a << 2;
        System.out.println("a << 2 = " + result); // 240
        result = a >> 2;
        System.out.println("a >> 2 = " + result); // 15
        result = a >>> 2;
        System.out.println("a >>> 2 = " + result); // 15
        }
}

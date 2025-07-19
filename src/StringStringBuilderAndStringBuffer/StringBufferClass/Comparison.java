package StringBufferClass;

public class Comparison {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Python");
        StringBuffer sb2 = new StringBuffer("Python");
        System.out.println("String s == t result: " + (sb1 == sb2)); // false - sb1 and sb2 pointing to different objects.

        // StringBuffer class is the child of Object class. StringBuffer class doesn't override the equals(),
        // The equals() works as class reference/address comparison. So, == and equals() are kind of same in StringBuffer.
        System.out.println("String s.equals(t) result: " + sb1.equals(sb2)); // false
    }
}

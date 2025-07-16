package NormalOrRegular.AccessingStaticAndInstanceMembers;

public class Outer1 {
    String s = "I am declared in Outer class.";
    class Inner {
        String s = "I am declared in Inner class.";

        public void printFunc() {
            String s = "I am declared in printFunc() of Inner class.";
            System.out.println(s); // printFunc() result.
            System.out.println(this.s); // Inner class result.
            System.out.println(Outer1.this.s); // Outer class result.
        }
    }

    public static void main(String[] args) {
        new Outer1().new Inner().printFunc();
    }
}

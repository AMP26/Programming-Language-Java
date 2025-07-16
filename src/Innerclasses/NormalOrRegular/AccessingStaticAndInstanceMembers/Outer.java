package NormalOrRegular.AccessingStaticAndInstanceMembers;
public class Outer {
    int a = 100;
    static int b = 200;
    class Inner /* Outer$Inner */ {
        public void printFunc() {
            System.out.println("Accessed the numbers " + a + " and " + b + " through Inner Class.");
        }
    }
    public static void main(String[] args) {
        new Outer().new Inner().printFunc();
    }
}

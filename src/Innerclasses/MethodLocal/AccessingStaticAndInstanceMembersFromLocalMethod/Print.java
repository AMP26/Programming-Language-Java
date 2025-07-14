package MethodLocal.AccessingStaticAndInstanceMembersFromLocalMethod;
public class Print {
    int a = 100;
    static int b = 500;
    public void printNum() {
        int c = 900;
        int d = 1200;
        class PrintClass {
            public void printFunc() {
                System.out.println("Number b: " + b);
                System.out.println("Number c: " + c);
                System.out.println("Number d: " + d);
            }
        }
        PrintClass pc = new PrintClass();
        pc.printFunc();
    }
    public static void main(String[] args) {
        Print p = new Print();
        p.printNum();
    }
}

package MethodLocal.AccessingStaticAndInstanceMembersFromClass;

public class Print {
    int a = 100;
    static int b = 500;
    public void printNum() /* if this method will be static then a compilation error will be there at line 13 */ {
        class PrintClass {
            // Method local inner class is rarely used because its scope is very less.
            public void printFunc() {
                // CE will occur for below statement i.e. Line 13 - Non-static variable "a" cannot be referenced from static context.
                System.out.println("Number 1: " + a);
                System.out.println("Number 2: " + b); // This statement will work fine as "b" is static.
            }
        }
    }
    public static void main(String[] args) {
        Print p = new Print();
        p.printNum();
    }
}

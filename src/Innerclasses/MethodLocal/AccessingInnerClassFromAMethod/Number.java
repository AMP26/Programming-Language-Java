package MethodLocal.AccessingInnerClassFromAMethod;
public class Number {
    public void calcNum() {
        class Multiplication {
            // Method local inner class is rarely used because its scope is very less.
            public void mulCalc(int a, int b) {
                System.out.println("Multiplication of numbers, " + a +" and "+ b + " is " + (a * b) );
            }
        }

        class Summation {
            public void sumCalc(int x, int y) {
                System.out.println("Summation of numbers, " + x +" and "+ y + " is " + (x + y) );
            }
        }

        Multiplication m = new Multiplication();
        m.mulCalc(10,10);
        m.mulCalc(20,20);

        Summation s = new Summation();
        s.sumCalc(100, 100);
        s.sumCalc(1000, 8000);
    }

    public static void main(String[] args) {
        Number num = new Number();
        num.calcNum();
    }
}

package OOPs.Polymorphism.compiletime.overloading;

public class Numbers {
    public int addNum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int addNum(int num1, int num2, int num3) {
        int sum = num1 +  + num3;
        return sum;
    }

    public double addNum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public float addNum(float num1, float num2) {
        float sum = num1 + num2;
        return sum;
    }
}

package ExceptionHandling.ControlFlow;

public class ControlF {
    public void controlF() {
        try {
            System.out.println("\nControl FLow in try-catch:");
            System.out.println("Statement 1 executed.");
            System.out.println("Statement 2 is " + 10/0);
            // Statement 3 will not be executed as there is an exception in statement 2.
            // After catch block is executed it won't return to try block again so statement 3 is not executed.
            // So take only risky code in try block and not normal code.
            System.out.println("Statement 3 executed.");
        }
        catch(ArithmeticException e) {
            System.out.println("Statement 4 is " + 200/5);
            System.out.println("Statement 5 executed.");
        }
    }
}

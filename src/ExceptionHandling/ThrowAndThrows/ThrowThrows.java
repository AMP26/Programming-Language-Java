package ExceptionHandling.ThrowAndThrows;

public class ThrowThrows {
    public void throwKeyW() throws ArithmeticException {
        // Objective is to hand over the created exception object to JVM manually.
        throw new ArithmeticException("Division by Zero!");
    }
}
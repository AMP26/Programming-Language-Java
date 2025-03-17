package ExceptionHandling.TryWithMulitipleCatch;

public class TryMultiCatch {
    public void tryMultiCatch() {
        try {
            int[] arr = new int[6];
            arr[7] = 1;
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled with a new result: "  + 100/20);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException Handled.");
        }
        catch(Exception e) {
            System.out.println("Previous two catch blocks couldn't handle.");
        }
    }
}

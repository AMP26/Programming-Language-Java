package ExceptionHandling.TryCatchFinally;

public class FinallyBlock {
    public void finallyBlock()
    {
        int[] arr = new int[10];

        try
        {
            int idx = arr[10];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Handled in Catch Block.");
        }
        finally {
            {
                System.out.println("Finally block executed.");
            }
        }
    }
}

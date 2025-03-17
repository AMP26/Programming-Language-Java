package ExceptionHandling.NormalTryCatch;

public class Excep {
        public void arith()
        {
            try
            {
                System.out.println(10/0);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Normal try-catch result: " + 10/2);
            }
        }
    }

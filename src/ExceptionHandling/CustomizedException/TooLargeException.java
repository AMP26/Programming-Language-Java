package ExceptionHandling.CustomizedException;

public class TooLargeException extends RuntimeException {
    TooLargeException(String str)
    {
        super(str);
    }
}

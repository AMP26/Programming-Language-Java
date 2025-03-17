package ExceptionHandling.CustomizedException;

public class TooSmallException extends RuntimeException {
    TooSmallException(String str)
    {
        super(str);
    }
}
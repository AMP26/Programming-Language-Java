package ExceptionHandling.CustomizedException;

import java.util.Scanner;

public class CustomE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num > 10000)
            throw new TooLargeException("The number "+ num +" is too large.");
        else if(num < 1000)
            throw new TooSmallException("The number " + num + " is too small.");
        else
            System.out.println("The number " + num + " is within the range.");
    }
}
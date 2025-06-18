package ExceptionHandling.ExceptionInfoMethods;

import java.sql.Connection;
import java.sql.DriverManager;

public class PrintST
{
    public void connectPrintST()
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "password");
            System.out.println("Connected Successfully.");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
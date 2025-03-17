package ExceptionHandling.ExceptionInfoMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetMessage
{
    public void getMsg()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "password");
            System.out.println("Connected Successfully.");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

package ExceptionHandling.ExceptionInfoMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TString
{
    public void tString()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgre", "postgres", "password");
            System.out.println("Connected Successfully.");
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }
}

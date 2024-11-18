package bank.management.system;

import java.sql.*;

public class connect {
    Connection connection;
    Statement statement;
    public connect()
    {
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Vgncs12gh@");
            statement=connection.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }

}

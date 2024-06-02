package appliancesystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class  database {
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/appliance_system", "root", "");

        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
package database;

import java.sql.*;

public class connector {
   

    public static Connection connection_java(){
        
        String url = "jdbc:mysql://localhost:3307/Abarrotes";
        String user = "root";
        String password = "1750974550Db@q";
        String driver = "com.mysql.cj.jdbc.Driver";

        Connection con = null;

        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url , user , password);

            System.out.println("Connecion exitosa");

        }
        catch(Exception e){
            System.out.println("Connecion fallida");

            e.getMessage();
        }
        return con;
    }
}

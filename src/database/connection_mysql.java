package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection_mysql {
   

    public static Connection connection_java(){
        
        String url = "jdbc:mysql://localhost:3306/Recuperacion_Java";
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
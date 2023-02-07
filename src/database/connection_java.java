package database;
import java.sql.*;
public class connection_java {
    Connection con = null;
    String username = "root";
    String password = "compu19---@";
    String url = "jdbc:mysql://localhost:3307/Agenda";
    public Connection connection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            if(con != null){
                System.out.println("coneccion existosa");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
       
        return con;
    }
   

}

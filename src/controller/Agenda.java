package controller;


import java.sql.*;


import javax.swing.JOptionPane;
import database.connection_java;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Agenda {

    @FXML
    private TextField Email;

    @FXML
    private TextField Name;

    @FXML
    private TextField Phone;

    @FXML
    private TextField Shearch_Ci;
  
    @FXML
    void Search(MouseEvent event) {
        String sql = "Select * from Registro where Cedula = ?";
        PreparedStatement prs;
        connection_java con = new connection_java();
        Connection connection = con.connection();
        System.out.println(sql);
        
        try{
            prs= connection.prepareStatement(sql);
            prs.setString(1, Shearch_Ci.getText());
            ResultSet rs = prs.executeQuery();
           
            while(rs.next()){
                Name.setText(rs.getString(3));
                Phone.setText(String.valueOf(rs.getInt(4)));
                Email.setText(rs.getString(5));
                String cedula = rs.getString(2);
                String nombre = rs.getString(3);
                int celular = rs.getInt(4);
                String email = rs.getString(5);
                System.out.println(cedula+ " " + nombre +" "+  celular +" " + email);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    
    @FXML
    void Update(MouseEvent event) {
        String Cedula = Shearch_Ci.getText().trim();
        String sql = "Update Registro set Nombre = ?, Celular = ?, Email = ? where Cedula = " + Cedula;
        PreparedStatement prs;
        connection_java con = new connection_java();
        Connection connection = con.connection();
        System.out.println(sql);

        try{
            prs= connection.prepareStatement(sql);
            prs.setString(1, Name.getText().trim());
            prs.setString(2, Phone.getText().trim());
            prs.setString(3, Email.getText().trim());
            prs.executeUpdate();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }
}

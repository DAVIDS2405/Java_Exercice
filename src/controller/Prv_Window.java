package controller;

import java.sql.*;

import javax.swing.JOptionPane;

import database.connector;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class Prv_Window {

    private static Alert alert = new Alert(null);
    private Connection con = null;
    private String query;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    @FXML
    private TextField Ci;

    @FXML
    private TextField Marca;

    @FXML
    private TextField Nombre;

    @FXML
    void Create(MouseEvent event) {
        if((Ci.getText().isEmpty()) || (Nombre.getText().isEmpty()) || (Marca.getText().isEmpty())){
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No se creara el provedor si no llena todos los datos");
            alert.setHeaderText("Error al crear un provedor");
            alert.showAndWait();
        }
        else{
            con = connector.connection_java();
            query = "insert into proveedor(ci_ruc_prv,nombre,marca) values(?,?,?)";
            try {
                pst = con.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(Ci.getText()));
                pst.setString(2, Nombre.getText());
                pst.setString(3,Marca.getText());
                pst.executeUpdate();
                
                alert.setAlertType(AlertType.CONFIRMATION);
                alert.setTitle("Confirmacion");
                alert.setContentText("Se creo correctamente el provedor");
                alert.setHeaderText("Provedor creado");
                alert.showAndWait();
                   
                pst.close();
                con.close();
                rs.close();
                
            } catch (Exception e) {

            }
        }
    }

    @FXML
    void Delete(MouseEvent event) {
        if((Ci.getText().isEmpty())){
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No se  el provedor si no llena la cedula");
            alert.setHeaderText("Error al eliminar un provedor");
            alert.showAndWait();
        }
        else{
            con = connector.connection_java();
            query = "delete from proveedor where ci_ruc_prv = ?";
            try {
                pst = con.prepareStatement(query);
                pst.setString(1, Ci.getText());
                pst.executeUpdate();

                alert.setAlertType(AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Se elimino el provedor correctamente");
                alert.setHeaderText("Confirmacion al eliminar un provedor");
                alert.showAndWait();
                
                pst.close();
                con.close();
                rs.close();
            } catch (Exception e) {
                
            }
        }
    }

    @FXML
    void Search(MouseEvent event) {
        if(Ci.getText().isEmpty()){
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No se  buscara el provedor si no llena la cedula");
            alert.setHeaderText("Error al buscar un provedor");
            alert.showAndWait();
        }
        else{

            
            con = connector.connection_java();
            query = "select * from Proveedor where ci_ruc_prv = ?";
            try {
                pst = con.prepareStatement(query);
                pst.setString(1, Ci.getText());
                rs = pst.executeQuery();

                if ((rs.next() == false)) {
                    alert.setAlertType(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("No se  encuentra el proveedor");
                    alert.setHeaderText("Error al encontrar en la base de datos un provedor");
                    alert.showAndWait();
                }

                else {
                    // provedor
                    int cedula_prov = rs.getInt("ci_ruc_prv");
                    String nombre_prov = rs.getString("nombre");
                    String marca_prov = rs.getString("marca");
                    Ci.setText((Integer.toString(cedula_prov)));
                    Nombre.setText(nombre_prov);
                    Marca.setText(marca_prov);

                }

                con.close();
                rs.close();
                pst.close();

            } catch (Exception e) {

            }

        }
        
    }

    @FXML
    void Update(MouseEvent event) {
        if ((Ci.getText().isEmpty()) || (Nombre.getText().isEmpty()) || (Marca.getText().isEmpty())) {
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No Puede realizar una actualizacion sin todos los campos");
            alert.setHeaderText("Error al actualizar un provedor");
            alert.showAndWait();
        } else {
            con = connector.connection_java();
            query = "update proveedor set ci_ruc_prv=?,nombre=?,marca=? where ci_ruc_prv =" + Ci.getText();
            try {
                pst = con.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(Ci.getText()));
                pst.setString(2, Nombre.getText());
                pst.setString(3, Marca.getText());
                pst.executeUpdate();
                
                alert.setAlertType(AlertType.INFORMATION);
                alert.setTitle("Actualizacion");
                alert.setContentText("Se actualizo correctamente el provedor");
                alert.setHeaderText("Provedor Actualizado");
                alert.showAndWait();
        
                pst.close();
                con.close();
                rs.close();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}

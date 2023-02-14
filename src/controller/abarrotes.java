package controller;

import java.sql.*;

import database.connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class abarrotes {

    private Connection con = null;
    String query;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @FXML
    private TextField Nombre;

    @FXML
    private TextField cantidad;

    @FXML
    private TextField precio;

    @FXML
    private ComboBox<Provedor> prv_combo;

    @FXML
    private ComboBox<Tipo_producto> tp_combox;
    @FXML
    private ObservableList<Tipo_producto> Ver_Prod;
    @FXML
    private ObservableList<Provedor> Ver_Prv;

    
    @FXML
    void Create(MouseEvent event) {

    }

    @FXML
    void Delete(MouseEvent event) {

    }

    @FXML
    void Search(MouseEvent event) {
        
        con = connector.connection_java();
        query = "select * from materia";
        String query2 = "select * from Proveedor";
        try {
            Ver_Prv = FXCollections.observableArrayList();
            prv_combo.setItems(Ver_Prv);
            PreparedStatement pst2 = null;
            pst2 = con.prepareStatement(query2);
            ResultSet rs2 = pst2.executeQuery();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String Nombre_prd= rs.getString("nbr_prd");
                String Cantidad = rs.getString("can_prd");
                String Precio = rs.getString("prc_prd");
                String tipo = rs.getString("tip_prd");
                int ci  = rs2.getInt("ci_ruc_prv");
                String Nom_prov = rs2.getString("nombre");
                String Marca = rs2.getString("Marca");
                Provedor prov = new Provedor(ci, Nom_prov, Marca);
                Ver_Prv.add(prov);
                Nombre.setText(Nombre_prd);
                cantidad.setText(Cantidad);
                precio.setText(Precio);
                

                

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @FXML
    void Update(MouseEvent event) {

    }

}

package controller;

import java.sql.*;

import database.connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Tipo_producto {
    private Connection con = null;
    private String Tipo;

    
    public Tipo_producto() {
    }

    public Tipo_producto(String tipo) {
        Tipo = tipo;
    }

    @Override
    public String toString() {
        return  Tipo ;
    }


    public ObservableList<Tipo_producto> getNombre_Producto() {

        con = connector.connection_java();
        ObservableList<Tipo_producto> prd_t = FXCollections.observableArrayList();
        String query = "select * from Productos";

        try {
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            ResultSet rs;
            rs = pst.executeQuery();

            while (rs.next()) {

                String tipo_producto = rs.getString("tip_prd");
                Tipo_producto prd_list = new Tipo_producto(tipo_producto);
                prd_t.add(prd_list);

            }
            con.close();
        } catch (Exception e) {

        }

        return prd_t;

    }
    

   
    
}

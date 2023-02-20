package controller;

import java.sql.*;

import database.connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Nombre_Producto {
    private Connection con = null;
    String Nombre;

    public Nombre_Producto(String nombre) {
        Nombre = nombre;
    }
    
    public Nombre_Producto() {
    }

    @Override
    public String toString() {
        return  Nombre;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public ObservableList<Nombre_Producto> getNombre_Producto() {

        con = connector.connection_java();
        ObservableList<Nombre_Producto> prd = FXCollections.observableArrayList();
        String query = "select * from Productos";

        try {
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            ResultSet rs;
            rs = pst.executeQuery();

            while (rs.next()) {

                String nombre_producto = rs.getString("nbr_prd");

                Nombre_Producto prd_list = new Nombre_Producto(nombre_producto);
                prd.add(prd_list);

            }
            con.close();
        } catch (Exception e) {

        }

        return prd;

    }

    
    
}

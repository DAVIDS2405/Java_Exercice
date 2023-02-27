package controller;

import java.sql.*;

import database.connection_mysql;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Anio {
    Connection con = null;
    int anio;


    public Anio() {
    }

    public Anio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return Integer.toString(anio);
    }
    
    public ObservableList<Anio> getAnios() {

        con = connection_mysql.connection_java();
        ObservableList<Anio> anio_t = FXCollections.observableArrayList();
        String query = "select * from Años";

        try {
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            ResultSet rs;
            rs = pst.executeQuery();

            while (rs.next()) {

                int anios = rs.getInt("anio");
                Anio anio_list = new Anio(anios);
                anio_t.add(anio_list);

            }
            con.close();
        } catch (Exception e) {

        }

        return anio_t;
    }    

    
}

package controller;

import java.sql.*;

import database.connection_mysql;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Mes {
    Connection con = null;
    String Mes;

    public Mes() {
    }

    public Mes(String mes) {
        Mes = mes;
    }
    
    @Override
    public String toString() {
        return Mes;
    }

    public ObservableList<Mes> getMeses() {

        con = connection_mysql.connection_java();
        ObservableList<Mes> mes_t = FXCollections.observableArrayList();
        String query = "select * from Meses order by mes";

        try {
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            ResultSet rs;
            rs = pst.executeQuery();

            while (rs.next()) {

                String meses = rs.getString("mes");
                Mes mes_list = new Mes(meses);
                mes_t.add(mes_list);

            }
            con.close();
        } catch (Exception e) {

        }

        return mes_t;

    }

    
    
    
}

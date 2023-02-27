package controller;

import java.sql.*;

import database.connection_mysql;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Dia {
    Connection con = null;
    int dia;

    public Dia() {
    }

    public Dia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return Integer.toString(dia);
    }


    
   
     public ObservableList<Dia> getDias() {

         con = connection_mysql.connection_java();
         ObservableList<Dia> dia_t = FXCollections.observableArrayList();
         String query = "select * from Dias";

        try {
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            ResultSet rs;
            rs = pst.executeQuery();

             while (rs.next()) {

                 int dia = rs.getInt("dia");
                 Dia dia_list = new Dia(dia);
                 dia_t.add(dia_list);

            }
           con.close();
       } catch (Exception e) {

         }

         return dia_t;

     }

}

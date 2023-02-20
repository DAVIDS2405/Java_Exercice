package controller;

import java.sql.*;

import database.connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Provedor {

    private Connection con = null;
    int ci;
    String Name;
    String Marca;
    public int getCi() {
        return ci;
    }
    
    public void setCi(int ci) {
        this.ci = ci;
    }

    
    public Provedor() {
    }

    public Provedor(int ci, String name, String marca) {
        this.ci = ci;
        Name = name;
        Marca = marca;
    }
    @Override
    public String toString() {
        return String.valueOf(getCi()) ;
    }

    public ObservableList<Provedor> getCi_Prv(){
        con = connector.connection_java();
        ObservableList<Provedor> prv = FXCollections.observableArrayList();
        String query = "select * from Proveedor";

        try {
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            ResultSet rs;
            rs = pst.executeQuery();

            while(rs.next()){

                int cedula_prov = rs.getInt("ci_ruc_prv");

                Provedor prv_list = new Provedor(cedula_prov, null, null);
                prv.add(prv_list);

            }
            con.close();
        } catch (Exception e) {
            
        }

        return prv;
       
    }


    
    
}

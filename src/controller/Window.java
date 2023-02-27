package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;

import java.util.ResourceBundle;

import database.connection_mysql;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

public class Window implements Initializable {
    
    private static Alert alert = new Alert(null);
    private Connection con = null;
    private String query;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    @FXML
    private ComboBox<Anio> Años;

    @FXML
    private Button Create;

    @FXML
    private ComboBox<Dia> Dias;

    @FXML
    private ComboBox<Mes> Meses;

    
    
    @FXML
    private ObservableList<Anio> Ver_Anios;

    @FXML
    private ObservableList<Mes> Ver_Mes;

    @FXML
    private ObservableList<Dia> Ver_Dias;

    @FXML
    void Create_date(MouseEvent event) {
        String Fechas = (Años.getEditor().getText()) + (Meses.getEditor().getText()) + (Dias.getEditor().getText());
  
        
        con = connection_mysql.connection_java();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
        Date fecha = (Date) formatter.parse(Fechas + "");
        System.out.println(fecha);
        // query = "insert into fechas (fechas) values(?)";
        // try {
        //     pst = con.prepareStatement(query);
        //     pst.setDate(1, fecha);
            
        // } catch (Exception e) {
           
        // }
    }
    
    //combo1.getEditor().getText();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Dia dias = new Dia();
        Ver_Dias = FXCollections.observableArrayList();
        Ver_Dias = dias.getDias();
        Dias.setItems(Ver_Dias);

        Mes meses = new Mes();
        Ver_Mes = FXCollections.observableArrayList();
        Ver_Mes = meses.getMeses();
        Meses.setItems(Ver_Mes);

        Anio anios = new Anio();
        Ver_Anios = FXCollections.observableArrayList();
        Ver_Anios = anios.getAnios();
        Años.setItems(Ver_Anios);


    }

   
    

    
    
}

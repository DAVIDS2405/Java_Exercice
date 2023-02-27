package controller;

import java.time.format.DateTimeFormatter;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class Window {

    @FXML
    private ComboBox<?> combo1;
    @FXML
    private ObservableList<?> Ver_Tprod;
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    //combo1.getEditor().getText();

    /*
     * Nombre_Producto nombre_Producto = new Nombre_Producto();
     * Ver_Prd = FXCollections.observableArrayList();
     * Ver_Prd = nombre_Producto.getNombre_Producto();
     * Nombre.setItems(Ver_Prd);
     * 
     * public ObservableList<Tipo_producto> getNombre_Producto() {
     * 
     * con = connector.connection_java();
     * ObservableList<Tipo_producto> prd_t = FXCollections.observableArrayList();
     * String query = "select * from Productos";
     * 
     * try {
     * PreparedStatement pst;
     * pst = con.prepareStatement(query);
     * ResultSet rs;
     * rs = pst.executeQuery();
     * 
     * while (rs.next()) {
     * 
     * String tipo_producto = rs.getString("tip_prd");
     * Tipo_producto prd_list = new Tipo_producto(tipo_producto);
     * prd_t.add(prd_list);
     * 
     * }
     * con.close();
     * } catch (Exception e) {
     * 
     * }
     * 
     * return prd_t;
     * 
     * }
     */ 
    

    
    
}

package controller;


import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;



import database.connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class abarrotes implements Initializable  {

    private static Alert alert = new Alert(null);
    private Connection con = null;
    private String query;
    private PreparedStatement pst = null;
    private ResultSet rs = null;


    @FXML
    private DatePicker fch_elab;

    @FXML
    private DatePicker fch_exp;


    @FXML
    private TextField cantidad;

    @FXML
    private TextField precio;

    @FXML
    private ComboBox<Nombre_Producto> Nombre;

    @FXML
    private ObservableList<Nombre_Producto> Ver_Prd;

    @FXML
    private ComboBox<Provedor> prv_combo;

    @FXML
    private ComboBox<Tipo_producto> tp_combox;

    @FXML
    private ObservableList<Tipo_producto> Ver_Tprod;
    
    @FXML
    private ObservableList<Provedor> Ver_Prv;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        

        tp_combox.setPromptText("Selecciona o escribe");
        Nombre.setPromptText("Selecciona o escribe");

        prv_combo.setPromptText("Selecciona o escribe");

        Provedor provedor = new Provedor();
        Ver_Prv = FXCollections.observableArrayList();
        Ver_Prv = provedor.getCi_Prv();
        prv_combo.setItems(Ver_Prv);

        Nombre_Producto nombre_Producto = new Nombre_Producto();
        Ver_Prd = FXCollections.observableArrayList();
        Ver_Prd = nombre_Producto.getNombre_Producto();
        Nombre.setItems(Ver_Prd);

        Tipo_producto tipo_producto = new Tipo_producto();
        Ver_Tprod = FXCollections.observableArrayList();
        Ver_Tprod = tipo_producto.getNombre_Producto();
        tp_combox.setItems(Ver_Tprod);

    }
    
    @FXML
    void Create(MouseEvent event) {
        Provedor provedor = new Provedor();
        Ver_Prv = FXCollections.observableArrayList();
        Ver_Prv = provedor.getCi_Prv();
        prv_combo.setItems(Ver_Prv);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if((Nombre.getEditor().getText().isEmpty())|| (tp_combox.getEditor().getText().isEmpty()) || (precio.getText().isEmpty()) || (cantidad.getText().isEmpty())||(prv_combo.getEditor().getText().isEmpty())||(fch_elab.getEditor().getText().isEmpty())||( fch_exp.getEditor().getText().isEmpty())){
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Todos los campos son necesarios para poder crear un producto");
            alert.setHeaderText("Error al crear un producto");
            alert.showAndWait();
        }
        else{
            con = connector.connection_java();
            query = "insert into productos (nbr_prd,tip_prd,fch_ven_prd,fch_fab_prd,prc_prd,can_prd,prv_fk) values (?,?,?,?,?,?,?)";
            try {
                pst = con.prepareStatement(query);
                pst.setString(1, (Nombre.getEditor().getText()));
                pst.setString(2,( tp_combox.getEditor().getText()));
                pst.setString(3, ((fch_exp.getValue()).format(formatter)));
                pst.setString(4, ((fch_elab.getValue()).format(formatter)));
                pst.setDouble(5, Double.parseDouble(precio.getText()));
                pst.setInt(6, Integer.parseInt(cantidad.getText()));
                pst.setInt(7,Integer.parseInt(prv_combo.getEditor().getText()));
                pst.executeUpdate();

                alert.setAlertType(AlertType.CONFIRMATION);
                alert.setTitle("Confirmacion");
                alert.setContentText("Se creo correctamente el Producto");
                alert.setHeaderText("Producto creado");
                alert.showAndWait();
                /*
                 * Whit out editable combo box
                 * pst.setInt(7,Integer.parseInt(prv_combo.getSelectedItem().toString()));
                 */


            } catch (SQLException e) {
                System.err.println("SQL exception: " + e.getMessage());

            }
        }
        
    }

    @FXML
    void Delete(MouseEvent event) {
        Provedor provedor = new Provedor();
        Ver_Prv = FXCollections.observableArrayList();
        Ver_Prv = provedor.getCi_Prv();
        prv_combo.setItems(Ver_Prv);

        if(Nombre.getEditor().getText().isEmpty()){
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Necesitas el nombre para poder eliminar un producto");
            alert.setHeaderText("Error al Eliminar un producto");
            alert.showAndWait();
        }
        else{
            con = connector.connection_java();
            query = "delete from productos where nbr_prd like ?";
            try {
                pst = con.prepareStatement(query);
                pst.setString(1, Nombre.getEditor().getText());
                pst.executeUpdate();
                
                alert.setAlertType(AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Se elimino el producto correctamente");
                alert.setHeaderText("Confirmacion al eliminar un producto");
                alert.showAndWait();
                
                pst.close();
                con.close();
                rs.close();
            } 
            catch (SQLException e) {
                System.err.println("SQL exception: " + e.getMessage());

            }
        }

    }



    @FXML
    void Search(MouseEvent event) {
        Provedor provedor = new Provedor();
        Ver_Prv = FXCollections.observableArrayList();
        Ver_Prv = provedor.getCi_Prv();
        prv_combo.setItems(Ver_Prv);

        if((Nombre.getEditor().getText()).isBlank()){
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No se buscara si no llena el campo nombre del producto");
            alert.setHeaderText("Error al buscar un producto");
            alert.showAndWait();
            
        }

        else{
            con = connector.connection_java();
            String busqueda = Nombre.getEditor().getText();
            

            query = "select prd.nbr_prd,prd.tip_prd,prd.fch_ven_prd,prd.fch_fab_prd,prd.prc_prd,prd.can_prd,pv.ci_ruc_prv, pv.nombre, pv.marca from productos as prd, proveedor as pv where prd.prv_fk = pv.ci_ruc_prv and nbr_prd like'%"
                    + busqueda + "%'";

            try {
                Ver_Prv = FXCollections.observableArrayList();
                Ver_Prd = FXCollections.observableArrayList();
                Ver_Tprod = FXCollections.observableArrayList();
                
                
                tp_combox.setItems(Ver_Tprod);
                prv_combo.setItems(Ver_Prv);
                Nombre.setItems(Ver_Prd);
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();

                if ((rs.next() == false)) {
                    alert.setAlertType(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("La tabla esta vacia o no existe lo que esta buscando");
                    alert.setHeaderText("Error al buscar un producto");
                    alert.showAndWait();
                    
                }

                else {

                    // Productos
                    String Nombre_prd = rs.getString("nbr_prd");
                    String Cantidad = rs.getString("can_prd");
                    String Precio = rs.getString("prc_prd");
                    String tipo = rs.getString("tip_prd");
                    Date dia_fb = rs.getDate("fch_fab_prd");
                    Date dia_ex = rs.getDate("fch_ven_prd");
                    Nombre_Producto prd = new Nombre_Producto(Nombre_prd);
                    Tipo_producto tpd = new Tipo_producto(tipo);
                    Ver_Tprod.add(tpd);
                    Ver_Prd.add(prd);
                    tp_combox.getEditor().setText(tipo);
                    Nombre.getEditor().setText(Nombre_prd);
                    

                    // provedor
                    int cedula_prov = rs.getInt("pv.ci_ruc_prv");
                    String nombre_prov = rs.getString("pv.nombre");
                    String marca_prov = rs.getString("pv.marca");
                    Provedor prov = new Provedor(cedula_prov, nombre_prov, marca_prov);
                    Ver_Prv.add(prov);
                    prv_combo.getEditor().setText((Integer.toString(cedula_prov)));
                    

                    cantidad.setText(Cantidad);
                    precio.setText(Precio);
                    fch_elab.setValue(dia_fb.toLocalDate());
                    fch_exp.setValue(dia_ex.toLocalDate());

                }

                con.close();
                rs.close();
                pst.close();

            } catch (SQLException e) {
                System.err.println("SQL exception: " + e.getMessage());

            }
        }

        
    }

    @FXML
    void Update(MouseEvent event) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if ((Nombre.getEditor().getText().isEmpty()) || (tp_combox.getEditor().getText().isEmpty())
                || (precio.getText().isEmpty()) || (cantidad.getText().isEmpty())
                || (prv_combo.getEditor().getText().isEmpty()) || (fch_elab.getEditor().getText().isEmpty())
                || (fch_exp.getEditor().getText().isEmpty())) {
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Todos los campos son necesarios para poder actualizar un producto");
            alert.setHeaderText("Error al crear un producto");
            alert.showAndWait();
        } else {
            con = connector.connection_java();
            query = "update productos set  nbr_prd = ?, tip_prd = ? , fch_ven_prd = ?, fch_fab_prd = ?, prc_prd = ? , can_prd = ? , prv_fk = ?";
            try {
                pst = con.prepareStatement(query);
                pst.setString(1, (Nombre.getEditor().getText()));
                pst.setString(2, (tp_combox.getEditor().getText()));
                pst.setString(3, ((fch_exp.getValue()).format(formatter)));
                pst.setString(4, ((fch_elab.getValue()).format(formatter)));
                pst.setDouble(5, Double.parseDouble(precio.getText()));
                pst.setInt(6, Integer.parseInt(cantidad.getText()));
                pst.setInt(7, Integer.parseInt(prv_combo.getEditor().getText()));
                pst.executeUpdate();

                alert.setAlertType(AlertType.CONFIRMATION);
                alert.setTitle("Confirmacion");
                alert.setContentText("Se creo correctamente el Producto");
                alert.setHeaderText("Producto creado");
                alert.showAndWait();
                /*
                 * Whit out editable combo box
                 * pst.setInt(7,Integer.parseInt(prv_combo.getSelectedItem().toString()));
                 */

            } catch (SQLException e) {
                System.err.println("SQL exception: " + e.getMessage());
                
            }
        }
    }

    @FXML
    void Proveedor_Window(MouseEvent event) {
        loadStage(event);
    }

    private void loadStage(Event event) {
        try {
            ((Node) (event.getSource())).getScene().getWindow();

            // Object eventSource = event.getSource();
            //Node sourceAsNode = (Node) eventSource;
            // Scene oldScene = sourceAsNode.getScene();
            // javafx.stage.Window window = oldScene.getWindow();
            // Stage stage = (Stage) window;
            // stage.hide();

            Parent root = FXMLLoader.load(getClass().getResource("/assets/view/Productor.fxml"));
            Scene scene = new Scene((root));
            Stage newStage = new Stage();
            newStage.setTitle("David Basantes");
            newStage.setScene(scene);
            newStage.show();

            // newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            // @Override
            // public void handle(WindowEvent event) {
            // Platform.exit();
            // }
            // });

        } catch (IOException ex) {
            ex.getMessage();

        }
    }

   

}

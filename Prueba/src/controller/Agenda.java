package controller;



import java.util.List;
import database.Agenda_mysql;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Agenda {
    private Agenda_mysql umsql = new Agenda_mysql();

    @FXML
    private Button actualizar;

    @FXML
    private TextField apellido;

    @FXML
    private Button buscar;

    @FXML
    private TextField cedula;

    @FXML
    private TextField celular;

    @FXML
    private Button crear;

    @FXML
    private TextField descripcion;

    @FXML
    private TextField direccion;

    @FXML
    private Button eliminar;

    @FXML
    private TextField nombre;
    
    @FXML
    void ac(ActionEvent event) {
        umsql.Actualizar_Persona(cedula.getText(), nombre.getText(), apellido.getText(), Integer.parseInt(celular.getText()), direccion.getText(), descripcion.getText());
        LimpiartextField();
    }

    @FXML
    void bs(ActionEvent event) {
        String Dni = cedula.getText();
        List<String> persona = umsql.Buscar_Persona(Dni);

        for (int i = 0; i < persona.size(); i++) {
            cedula.setText((persona.get(0)));
            nombre.setText((persona.get(1)));
            apellido.setText((persona.get(2)));
            celular.setText((persona.get(3)));
            descripcion.setText((persona.get(4)));
            direccion.setText((persona.get(5)));
    
        }
    }

    @FXML
    void cr(ActionEvent event) {
        umsql.crear_persona(cedula.getText(), nombre.getText(), apellido.getText(), Integer.parseInt(celular.getText()), direccion.getText(), descripcion.getText());
        LimpiartextField();
    }

    @FXML
    void el(ActionEvent event) {
        umsql.eliminar_persona(cedula.getText());
        LimpiartextField();
    }

    public void LimpiartextField(){
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        celular.setText("");
        direccion.setText("");
        descripcion.setText("");

    }

}

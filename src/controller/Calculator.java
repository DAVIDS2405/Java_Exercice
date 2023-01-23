package controller;


import java.text.ParseException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Calculator {

    @FXML
    private Button Clean;

    @FXML
    private Button Delete;

    @FXML
    private Button Division;

    @FXML
    private Button Equals;

    @FXML
    private MenuBar History;

    @FXML
    private TextArea History_Area;

    @FXML
    private Button Minus;

    @FXML
    private Button Multiplication;

    @FXML
    private Button Number0;

    @FXML
    private Button Number1;

    @FXML
    private Button Number2;

    @FXML
    private Button Number3;

    @FXML
    private Button Number4;

    @FXML
    private Button Number5;

    @FXML
    private Button Number6;

    @FXML
    private Button Number7;

    @FXML
    private Button Number8;

    @FXML
    private Button Number9;

    @FXML
    private Button Plus;

    @FXML
    private Label Prevnum;

    @FXML
    private TextField Result;

    boolean Operationon = true;
    double LastOperation = 0;

    @FXML
    void Addvalue(ActionEvent event) {
        Result.setText(Result.getText() + ((Button)event.getSource()).getText());
        Operationon = true;
    }
     @FXML
    void AddOperation(ActionEvent event) {
        if(Operationon){
            Result.setText(Result.getText() + ((Button) event.getSource()).getText());
            Operationon = false;
        }

    }


    public void Clean(){
        Result.setText("");
        Operationon=true;
    }

    public void Delete(){
        if(!(Result.getText().length() == 0)){
            Result.setText(Result.getText().substring(0,Result.getText().length() -1));
        }
    }

    public void Resultoperation(){
       
        System.out.println(LastOperation = Double.parseDouble(Result.getText()));
        
        
        
    }
    public void GetlastResult(){
        if(!(LastOperation == 0.0)){
            Result.setText(Result.getText() + LastOperation);
        }
    }
  
}
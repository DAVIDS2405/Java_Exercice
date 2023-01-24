package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Calculator {

    @FXML
    private TextArea History_Area;
    @FXML
    private TextField Result;
    @FXML
    private Label Prevnum;

    private double Num1 = 0;
    private String Operator = "+";

    @FXML
    void Addvalue(ActionEvent event) {
        int value = Integer.parseInt(((Button)event.getSource()).getText());
        Result.setText(Double.parseDouble(Result.getText()) == 0.0 ? String.valueOf((double)value) : String.valueOf(Double.parseDouble(Result.getText())*10 + value));
    //    System.out.println(String.valueOf((double) value));
    //    System.out.println(String.valueOf(Double.parseDouble(Result.getText())*10 + value));
    }
     @FXML
    void AddOperation(ActionEvent event) {
        
            String Symbol = ((Button) event.getSource()).getId();
            if(Symbol.equals("Equals")){
                double num2 = Double.parseDouble(Result.getText());
                // System.out.println(num2);
                switch(Operator){
                    case "+":{
                        Result.setText((Num1 + num2) + "");
                        History_Area.setText(Num1 + Operator + num2 + " = " + Result.getText() + "\n" +  History_Area.getText());
                        Prevnum.setText(Num1 + Operator + num2);
    
                        break;
                    }
                    case "-": {
                        Result.setText((Num1 - num2) + "");
                        History_Area.setText(Num1 + Operator + num2 + " = " + Result.getText() + "\n" +  History_Area.getText());
                        Prevnum.setText(Num1 + Operator + num2);
                        break;
                    }
                    case "*": {
                        Result.setText((Num1 * num2) + "");
                        History_Area.setText(Num1 + Operator + num2 + " = " + Result.getText() + "\n" +  History_Area.getText());
                        Prevnum.setText(Num1 + Operator + num2);
                        break;
                    }
                    case "/": {
                        Result.setText((Num1 / num2) + "");
                        History_Area.setText(Num1 + Operator + num2 + " = " + Result.getText() + "\n" +  History_Area.getText());
                        Prevnum.setText(Num1 + Operator + num2);
                        
                    }
                    
                }
                
                Operator = ".";
            }
            else if(Symbol.equals("Clean")){
                Result.setText(String.valueOf(0.0));
                Operator = ".";
            }
            else{
                switch(Symbol){
                    case "Plus" -> Operator ="+";
                    case "Minus" -> Operator = "-";        
                    case "Multiplication" -> Operator = "*";
                    case "Division" -> Operator = "/";
                }
                Num1 = Double.parseDouble(Result.getText());
                // System.out.println(Num1);
                Result.setText(String.valueOf(0.0));
                
            }
           
           
        

    }


    public void Delete(){
        if(!(Result.getText().length() == 0.0)){
            // System.out.println(Result.getText().length());
            Result.setText(Result.getText().substring(0,Result.getText().length() - 1));
            System.out.println(Result.getText().substring(0, Result.getText().length() - 1));
        }
    }

   
  
}
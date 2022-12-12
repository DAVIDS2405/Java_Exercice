//Libaray
import javax.swing.JOptionPane;
public class Vehiculos {

    //ATTRIBUTES
    String Placa;
    String Tipo_De_Vehiculo;
    String Motor_De_Vehiculo;
    String Color;
    String Marca;
    int Precio;
    String Modelo;
    int Ruedas_Elices_Aletas_Vehiculo;
    
    //Array for the cars 
    Vehiculos vehiculo[] = new Vehiculos[5];

    //METHODS
    public  void encender_vehiculo(){

    }
    public void apagar_de_vehiculo(){

    }
    public void acelera_de_vehiculo(){

    }
    public void frenar_de_vehiculo(){

    }

    //CONSTRUCTOR
    public Vehiculos(String placa, String tipo_De_Vehiculo, String motor_De_Vehiculo, String color, String marca,
            int precio, String modelo, int ruedas_Elices_Aletas_Vehiculo) {
        Placa = placa;
        Tipo_De_Vehiculo = tipo_De_Vehiculo;
        Motor_De_Vehiculo = motor_De_Vehiculo;
        Color = color;
        Marca = marca;
        Precio = precio;
        Modelo = modelo;
        Ruedas_Elices_Aletas_Vehiculo = ruedas_Elices_Aletas_Vehiculo;
    }
    //GETTER AND SETTER
    public String getPlaca() {
        return Placa;
    }
   
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getTipo_De_Vehiculo() {
        return Tipo_De_Vehiculo;
    }
    public void setTipo_De_Vehiculo(String tipo_De_Vehiculo) {
        Tipo_De_Vehiculo = tipo_De_Vehiculo;
    }
    public String getMotor_De_Vehiculo() {
        return Motor_De_Vehiculo;
    }
    public void setMotor_De_Vehiculo(String motor_De_Vehiculo) {
        Motor_De_Vehiculo = motor_De_Vehiculo;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    
    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getRudas_Elices_Aletas_Vehiculo() {
        return Ruedas_Elices_Aletas_Vehiculo;
    }
    public void setRudas_Elices_Aletas_Vehiculo(int rudas_Elices_Aletas_Vehiculo) {
        Ruedas_Elices_Aletas_Vehiculo = rudas_Elices_Aletas_Vehiculo;
    }
    
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    
    @Override
    public String toString() {
        return "Vehiculos Placa=" + Placa + "\n Tipo_De_Vehiculo=" + Tipo_De_Vehiculo + "\nMotor_De_Vehiculo="
                + Motor_De_Vehiculo + "\nColor=" + Color + "\nMarca=" + Marca + "\nPrecio=" + Precio + "\nModelo="
                + Modelo + "\nRuedas_Elices_Aletas_Vehiculo=" + Ruedas_Elices_Aletas_Vehiculo;

    }

    //Funtion for menu 


    
    public void Ver_Vehiculos(){
        for(Vehiculos vehiculos: vehiculo){
            JOptionPane.showMessageDialog(null, "Los 5 vehiculos ingresados son\n"+ vehiculos.toString());;
        }
    }

    public void Llenar_Vehiculos(){
        for(int i = 0; i < vehiculo.length; i++){
            Placa = JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese la placa de su Vehiculo" );
            Marca = JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese la marca de su Vehiculo");
            Modelo = JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese el modelo de su Vehiculo");
            Color = JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese el color de su Vehiculo");
            Tipo_De_Vehiculo = JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese el tipo de Vehiculo");
            Motor_De_Vehiculo = JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese el tipo de motor de su Vehiculo");
            Precio = Integer.parseInt(JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese el precio de su Vehiculo"));
            Ruedas_Elices_Aletas_Vehiculo = Integer.parseInt(JOptionPane.showInputDialog("Vehiculo Nº" + (i + 1) +"\nIngrese el numero de ruedas, aletas, alas de su Vehiculo"));
            vehiculo[i] = new Vehiculos(Placa, Tipo_De_Vehiculo, Motor_De_Vehiculo, Color, Marca, Precio,Modelo, Ruedas_Elices_Aletas_Vehiculo);
        }

    }
   
    
}

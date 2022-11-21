public class Cuenta {
    
    //ATRIBUTES 
    double dinero_en_cuenta;
    String Titular_de_cuenta;

    //Metodos

    public void Retirar_Dinero(){

    }
    public void Agregar_Dinero(){

    }

    //Constuctor
    public void Cuentas (){
        dinero_en_cuenta = 0;
        Titular_de_cuenta = "";
    }
    
    //Getter and Setter

    public double getDinero_en_cuenta() {
        return dinero_en_cuenta;
    }
    public void setDinero_en_cuenta(double dinero_en_cuenta) {
        this.dinero_en_cuenta = dinero_en_cuenta;
    }
    public String getTitular_de_cuenta() {
        return Titular_de_cuenta;
    }
    public void setTitular_de_cuenta(String titular_de_cuenta) {
        Titular_de_cuenta = titular_de_cuenta;
    }


}

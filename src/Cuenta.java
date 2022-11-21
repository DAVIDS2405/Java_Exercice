

public class Cuenta {

    
    
    //ATRIBUTES 
    double dinero_en_cuenta;
    String Titular_de_cuenta;

    //Metodos

    //metodo para retirar dinero
    public void Retirar_Dinero(double dinero)//variable para el dinero
    {
        //Validacion del dinero si es menor a 0
        if (getDinero_en_cuenta() <= 0 ){
            System.out.println("no puedes retirar dinero inexistente");
        }
        //Validacion en caso de que haya dinero
        else{
            setDinero_en_cuenta(getDinero_en_cuenta() - dinero);
        }


    }
    public void Agregar_Dinero(double dinero){
        //sirve para agregar mas dinero 
        setDinero_en_cuenta(getDinero_en_cuenta()+dinero);
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

    public void Mostrar_Cuenta(){
        System.out.println("");
        System.out.println("Titular" + getTitular_de_cuenta());
        System.out.println("Dinero " + getDinero_en_cuenta());
        System.out.println("");
    }


    

}

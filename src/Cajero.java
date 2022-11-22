public class Cajero {
    //ATTRIBUTES
    String Persona_titular_cuenta;
    double Dinero_cuenta;
    

    //CONSTRUCTOR
    
    

    public void Cajero(){
        Persona_titular_cuenta = "";
        Dinero_cuenta = 0;
    }
        
    
    
    // METHODS
    public void Depositar_dinero(double dinero){
        System.out.println("deposito");
        if ( dinero < 0 || dinero == 0 || getDinero_cuenta() == 0 ){
            System.out.println("ingrese dinero valido");
            
        }
        else{
            setDinero_cuenta(getDinero_cuenta()- dinero);
        }
    }

    

    public void Retirar_dinero(double dinero){
        if ( dinero < 0 || dinero == 0 || getDinero_cuenta() == 0 ){
            System.out.println("ingrese dinero valido");
        }
        else{
            setDinero_cuenta(getDinero_cuenta()- dinero);
        }
    }
    public void Ingresar_dinero(double dinero){
        if ( dinero < 0 || dinero == 0){
            System.out.println("ingrese dinero valido");
        }
        else{
            setDinero_cuenta(getDinero_cuenta() + dinero);
        }
    }

    

    //GETTER AND SETTER
    public String getPersona_titular_cuenta() {
        return Persona_titular_cuenta;
    }


    public void setPersona_titular_cuenta(String persona_titular_cuenta) {
        Persona_titular_cuenta = persona_titular_cuenta;
    }


    public double getDinero_cuenta() {
        return Dinero_cuenta;
    }


    public void setDinero_cuenta(Double dinero_cuenta) {
        Dinero_cuenta = dinero_cuenta;
    }


    @Override
    public String toString() {
        return "Cajero [Persona_titular_cuenta=" + Persona_titular_cuenta + ", Dinero_cuenta=" + Dinero_cuenta + "]";
    }

    


}

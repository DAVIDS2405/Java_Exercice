public class Cajero {
    //ATTRIBUTES
    boolean Tarjeta_credito;
    String Persona_titular_cuenta;
    int contraseña;
    int Dinero_cuenta;
    

    //CONSTRUCTOR
    public Cajero(String persona_titular_cuenta, int dinero_cuenta) {
        Persona_titular_cuenta = persona_titular_cuenta;
        Dinero_cuenta = dinero_cuenta;
    }


    
    // METHODS
    public void Depositar_dinero(int dinero){
        System.out.println("deposito");
        if ( dinero < 0 || dinero == 0 || getDinero_cuenta() == 0 ){
            System.out.println("ingrese dinero valido");
        }
        else{
            setDinero_cuenta(getDinero_cuenta()- dinero);
        }
    }

    public void Retirar_dinero(int dinero){
        if ( dinero < 0 || dinero == 0 || getDinero_cuenta() == 0 ){
            System.out.println("ingrese dinero valido");
        }
        else{
            setDinero_cuenta(getDinero_cuenta()- dinero);
        }
    }
    public void Ingresar_dinero(int dinero){
        if ( dinero < 0 || dinero == 0 || getDinero_cuenta() == 0 ){
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


    public int getDinero_cuenta() {
        return Dinero_cuenta;
    }


    public void setDinero_cuenta(int dinero_cuenta) {
        Dinero_cuenta = dinero_cuenta;
    }



    public boolean isTarjeta_credito() {
        return Tarjeta_credito;
    }



    public void setTarjeta_credito(boolean tarjeta_credito) {
        Tarjeta_credito = tarjeta_credito;
    }



    public int getContraseña() {
        return contraseña;
    }



    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }   

    


}

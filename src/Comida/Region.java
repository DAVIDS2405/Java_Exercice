package Comida;

public class Region extends Comida {

    private String Pais, Region, Continente;

    public Region(String ingredientes, String tiempo_Coccion, String pasos_seguir, int precio, String pais,
            String region, String continente) {
        super(ingredientes, tiempo_Coccion, pasos_seguir, precio);
        Pais = pais;
        Region = region;
        Continente = continente;
        
    }

    @Override
    public String toString() {
        return super.toString()+"\nPais del plato" + Pais + "\nRegion del pais " + Region + "\nContinente " + Continente ;
    }

    
    
    
}

package Comida;
public class Comida  {

    private String Ingredientes, Tiempo_Coccion,Pasos_seguir;
    private int Precio;

    public Comida(String ingredientes, String tiempo_Coccion, String pasos_seguir, int precio) {
        Ingredientes = ingredientes;
        Tiempo_Coccion = tiempo_Coccion;
        Pasos_seguir = pasos_seguir;
        Precio = precio;

        if(Precio < 0 ){
            throw new IllegalArgumentException("Ingrese precios positivos");
        }
    }

    @Override
    public String toString() {
        return "Ingredientes del plato" + Ingredientes + "\nTiempo de coccion " + Tiempo_Coccion + "\nPasos a seguir "
                + Pasos_seguir + "\nPrecio del plato " + Precio ;
    }


   


    
}

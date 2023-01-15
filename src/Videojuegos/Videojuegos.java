package Videojuegos;
public  class Videojuegos {
    //Attributes
    private String Tipo_Juego, Nombre_Juego;
    private int Numero_Jugadores;
    private double Precio_Juego;
   
    
    //Constructor
    public Videojuegos(String tipo_Juego, String nombre_Juego, int numero_Jugadores,
            double precio_Juego) {
        Tipo_Juego = tipo_Juego;
        Nombre_Juego = nombre_Juego;
        Numero_Jugadores = numero_Jugadores;
        Precio_Juego = precio_Juego;
        //exepciones para evitar que se ingresen precios menores a 0 
        if (precio_Juego < 0){
            throw new IllegalArgumentException("No puede ingresar valores en los juegos que sean menores a 0");

        }
    }

    //Methods
    //Metodo principal toString del programa que se ocupa en los demas
    @Override
    public String toString() {
        return "\n"+"Nintendo presenta" +"\nTipo de Juego " + Tipo_Juego + "\nNombre del Juego" + Nombre_Juego + "\nCuantos jugadores pueden jugar "
                + Numero_Jugadores + "\nPrecio del Juego " +Precio_Juego;
    }


    
}

package Videojuegos;
public abstract class Videojuegos {
    private String Tipo_Juego, Nombre_Juego;
    private int Numero_Jugadores;
    private double Precio_Juego;
   
    
    //COnstructor
    public Videojuegos(String tipo_Juego, String nombre_Juego, int numero_Jugadores,
            double precio_Juego) {
        Tipo_Juego = tipo_Juego;
        Nombre_Juego = nombre_Juego;
        Numero_Jugadores = numero_Jugadores;
        Precio_Juego = precio_Juego;
        //exepciones
        if (precio_Juego < 0){
            throw new IllegalArgumentException("No puede ingresar valores en los juegos que sean menores a 0");

        }
    }

    

    public String getNombre_Juego() {
        return Nombre_Juego;
    }


    public String getTipo_Juego() {
        return Tipo_Juego;
    }
    

    public int getNumero_Jugadores() {
        return Numero_Jugadores;
    }



    public double getPrecio_Juego() {
        return Precio_Juego;
    }




    //Metodo abstracto para mostrar juegos
    public abstract String MostrarDatos();



    
}

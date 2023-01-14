package Videojuegos;

public class Juegos extends Nintendo {

   private double Metacritic;

    public Juegos(String tipo_Juego, String nombre_Juego, int numero_Jugadores, double precio_Juego,
        int anio_Publicacion, String edicion_Limitada, double metacritic) {
        super(tipo_Juego, nombre_Juego, numero_Jugadores, precio_Juego, anio_Publicacion, edicion_Limitada);
        Metacritic = metacritic;
        if (Metacritic < 0 || Metacritic > 100 ){
            throw new IllegalArgumentException(
                    "Metacritic acepta solo calificaciones de 0 a 100");
        }
    
    }

    
    @Override
    public String MostrarDatos() {

        return "\nNINTENDO PRESENTA\n" + getNombre_Juego() + "\nCon un precio de: " + getPrecio_Juego() + "\nEdicion limitada: " + getEdicion_Limitada() + "\nPublicado en el año: "+ getAnio_Publicacion() + "\nTipo de juego: " +getTipo_Juego() + "\nNumero de jugadores: " + getNumero_Jugadores() + "\nUna puntuacion en metacritic de: " + Metacritic ;
    }

    
}

package Videojuegos;

public class Nintendo extends Videojuegos {

    private int Anio_Publicacion;

    private String Edicion_Limitada;



    public Nintendo(String tipo_Juego, String nombre_Juego, int numero_Jugadores,
            double precio_Juego, int anio_Publicacion,String edicion_Limitada) {
        super(tipo_Juego, nombre_Juego, numero_Jugadores, precio_Juego);
        Anio_Publicacion = anio_Publicacion;
        Edicion_Limitada = edicion_Limitada;

        if(Anio_Publicacion < 0 ){
            throw new IllegalArgumentException("No puedes tener años menores que 0 ");
        }
    }

    


    public int getAnio_Publicacion() {
        return Anio_Publicacion;
    }




    public String getEdicion_Limitada() {
        return Edicion_Limitada;
    }




    @Override
    public String MostrarDatos() {
        
        return null;
    }
    
}

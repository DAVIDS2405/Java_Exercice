package Videojuegos;

public class Nintendo extends Videojuegos {

    //Attributes
    private int Anio_Publicacion;
    private String Edicion_Limitada;


    //Constructor
    //Se incluye todo incluso los atributos de videojuegos
    public Nintendo(String tipo_Juego, String nombre_Juego, int numero_Jugadores,
            double precio_Juego, int anio_Publicacion,String edicion_Limitada) {
        super(tipo_Juego, nombre_Juego, numero_Jugadores, precio_Juego); //Atributos que tenemos en videojuegos
        Anio_Publicacion = anio_Publicacion;
        Edicion_Limitada = edicion_Limitada;

        //Exepcion en casi de que el usuario ponga años menores a 0
        if(Anio_Publicacion < 0 ){
            throw new IllegalArgumentException("No puedes tener años menores que 0 ");
        }
    }


    //Methods
    //Metodo que permite ver lo que tiene Nintendo (Atributos) 
    //Super nos permite ver lo que tiene nuestra clase padre en ToString
    @Override
    public String toString() {
        return super.toString()+"\nAño de Publicacion " + Anio_Publicacion + "\n¿Es edicion limitada? " + Edicion_Limitada ;
    }




   
    
}

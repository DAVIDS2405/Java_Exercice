package Musica;

public class Banda extends Musica{

    //Attributes
    private String Nombre_Banda,Disco_Grafia,Separados_integrantes;
    private int Anio_Fundacion;
    

    //Constructor
    public Banda(int tempo, String nombre_Cancion, String genero, String instrumentos, String nombre_Banda,
            String disco_Grafia, String separados_integrantes, int anio_Fundacion) {
        super(tempo, nombre_Cancion, genero, instrumentos);
        Nombre_Banda = nombre_Banda;
        Disco_Grafia = disco_Grafia;
        Separados_integrantes = separados_integrantes;
        Anio_Fundacion = anio_Fundacion;
        if (Anio_Fundacion < 0){
            throw new IllegalArgumentException("Ingrese numeros positivos no hay años negativos");
        }
    }

    //Methods
    @Override
    public String toString() {
        return super.toString()+"\nNombre de la Banda" + Nombre_Banda + "\nDiscoGrafia " + Disco_Grafia + "\n¿Sus integrantes estan separados? "
                + Separados_integrantes + "\nAño de Fundacion de la banda " + Anio_Fundacion;
    }

    
   

    
    

}

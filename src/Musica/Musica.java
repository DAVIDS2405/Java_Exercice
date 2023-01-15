package Musica;
public  class  Musica {
    private int Tempo;
    private String Nombre_Cancion, Genero, Instrumentos;



    
    public Musica(int tempo, String nombre_Cancion, String genero, String instrumentos) {
        Tempo = tempo;
        Nombre_Cancion = nombre_Cancion;
        Genero = genero;
        Instrumentos = instrumentos;
    }


    @Override
    public String toString() {
        return "\nNombre de la cancion " + Nombre_Cancion + "\nGenero " 
        + Genero + "\nInstrumentos " + Instrumentos + "\nTempo " + Tempo;
    }


   
}

package Musica;
public  class  Musica {
    int Tempo;
    String Nombre_Cancion, Genero, Instrumentos;



    
    public Musica(int tempo, String nombre_Cancion, String genero, String instrumentos) {
        Tempo = tempo;
        Nombre_Cancion = nombre_Cancion;
        Genero = genero;
        Instrumentos = instrumentos;
    }


    @Override
    public String toString() {
        return "Musica [Tempo=" + Tempo + ", Nombre_Cancion=" + Nombre_Cancion + ", Genero=" + Genero
                + ", Instrumentos=" + Instrumentos + "]";
    }


   
}

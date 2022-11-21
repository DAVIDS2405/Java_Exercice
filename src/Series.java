
public class Series {
    //Attributes
  String Titulo;
    int Numero_Temporadas = 3;
    boolean Entregado = false;
    String Genero;
    String Creador;


    //Methods
    public void entregar(){

    }
    public void devolver(){

    }
    public boolean isEntregado() {
        return Entregado;
    }


    //Constructor
    public Series(String titulo, int numero_Temporadas, boolean entregado, String genero, String creador) {
        Titulo = titulo;
        Numero_Temporadas = numero_Temporadas;
        Entregado = entregado;
        Genero = genero;
        Creador = creador;
    }

    public Series(String titulo, String creador) {
        Titulo = titulo;
        Creador = creador;
    }

    public Series(String titulo, int numero_Temporadas, String genero, String creador) {
        Titulo = titulo;
        Numero_Temporadas = numero_Temporadas;
        Genero = genero;
        Creador = creador;
    }
    

    
    //Getter and setter
    public String getTitulo() {
        return Titulo;
    }
    

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }


    public int getNumero_Temporadas() {
        return Numero_Temporadas;
    }


    public void setNumero_Temporadas(int numero_Temporadas) {
        Numero_Temporadas = numero_Temporadas;
    }

    public String getGenero() {
        return Genero;
    }


    public void setGenero(String genero) {
        Genero = genero;
    }


    public String getCreador() {
        return Creador;
    }


    public void setCreador(String creador) {
        Creador = creador;
    }



    //To string

    @Override
    public String toString() {
        return "Series [Titulo=" + Titulo + ", Numero_Temporadas=" + Numero_Temporadas + ", Entregado=" + Entregado
                + ", Genero=" + Genero + ", Creador=" + Creador + "]";
    }


    
}

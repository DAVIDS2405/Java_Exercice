
public class Series {
    //Attributes
  String Titulo;
    int Numero_Temporadas = 3;
    boolean Entregado = false;
    String Genero;
    String Creador;


    //Methods


    //Constructor
    public void Serie1 (){
        Titulo = "Friends";
        Numero_Temporadas = 10;
        Entregado = false;
        Genero = "Comedia";
        Creador = "Marta Kauffman y David Crane";

    }
    public void Serie2 (){
        Titulo = "Avatar la leyenda de Anng";
        Numero_Temporadas = 4;
        Entregado = false;
        Genero = "Aventura";
        Creador = " Michael Dante DiMartino y Bryan Konietzko";

    }
    public void Serie3 (){
        Titulo = "Mr.Robot";
        Numero_Temporadas = 10;
        Entregado = false;
        Genero = "Investigacion";
        Creador = "Sam Esmail";

    }
    public void Serie4 (){
        Titulo = "Saint Seiya";
        Numero_Temporadas;
        Entregado = false;
        Genero = "Comedia";
        Creador = "Marta Kauffman y David Crane";

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


    public boolean isEntregado() {
        return Entregado;
    }


    public void setEntregado(boolean entregado) {
        Entregado = entregado;
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

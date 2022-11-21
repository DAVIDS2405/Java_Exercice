public class videojuegos{

    //Atributos
    String Titulo;
    int Hor_Est = 10;
    boolean Entregado = false;
    String Genero;
    String Compania;

    //Metodos



    //Constructor

    public void game1(){
         Titulo= "God of War";
         Hor_Est = 10;
         Entregado = false;
         Genero = " Accion";
         Compania = "Santa Monica";
    }
    public void game2(){
        Titulo= "Stay";
        Hor_Est = 5;
        Entregado = false;
        Genero = "Puzzle";
        Compania = "Bluetwelve Studio";
    }
    public void game3(){
        Titulo= "Horizon Forbbiden West";
        Hor_Est = 20;
        Entregado = false;
        Genero = "Ciencia Ficcion";
        Compania = "Guerrila Games" ;
    }
    public void game4(){
        Titulo= "Xenoblade Chronicales 3";
        Hor_Est = 25;
        Entregado = false;
        Genero = "Adventure" ;
        Compania = "Monolith Soft";
    }
    public void game5(){
        Titulo= "Pokemon Purple";
        Hor_Est = 35;
        Entregado = false;
        Genero = "Adventure" ;
        Compania = "Game Freak";
    }
    // Getters y Setters

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getHor_Est() {
        return Hor_Est;
    }

    public void setHor_Est(int hor_Est) {
        Hor_Est = hor_Est;
    }


    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String compania) {
        Compania = compania;
    }

    public String toString() {
        return "videojuegos [Titulo=" + Titulo + ", Horas Estimadas=" + Hor_Est + ", Entregado=" + Entregado
                + ", Genero=" + Genero + ", Creador=" + Compania + "]";
    }
}
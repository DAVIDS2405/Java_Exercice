package Musica;

import java.util.ArrayList;
import java.util.Scanner;

public class Cancion extends Banda {
    
    private static Scanner entrada_datos = new Scanner(System.in);
    private static ArrayList<Musica> Lista_Musica = new ArrayList<Musica>();
    //Attributes
    private String Premio_Grami, Popular;


    //Constructor
    public Cancion(int tempo, String nombre_Cancion, String genero, String instrumentos, String nombre_Banda,
            String disco_Grafia, String separados_integrantes, int anio_Fundacion, String premio_Grami, String popular) {
        super(tempo, nombre_Cancion, genero, instrumentos, nombre_Banda, disco_Grafia, separados_integrantes,
                anio_Fundacion);
        Premio_Grami = premio_Grami;
        Popular = popular;
    }


    //Methods

    @Override
    public String toString() {
        return super.toString()+"\nTiene un premio Grami " + Premio_Grami + "\nEs la cancion popular " + Popular ;
    }


    public void LLenar_Canciones (int numero_canciones){
        int tempo, anio_Fundacion;
        String nombre_Cancion, Genero, instrumentos, nombre_banda, disco_grafia,separados_integrantes,premio_grami,popular;
        for(int i = 0; i < numero_canciones ; i++){
            System.out.println();
            System.out.println("Cancion " +(i+1));
            System.out.print("Ingrese el nombre de la cancion ");
            nombre_Cancion = entrada_datos.nextLine();
            System.out.print("Ingrese el nombre de la banda ");
            nombre_banda = entrada_datos.nextLine();
            System.out.print("Ingrese el año de fundacion de la banda ");
            anio_Fundacion = entrada_datos.nextInt();
            entrada_datos.nextLine();
            System.out.print("Ingrese el genero de la cancion ");
            Genero = entrada_datos.nextLine();
            System.out.print("Ingrese los instrumentos que se ocupan ");
            instrumentos = entrada_datos.nextLine();
            System.out.print("Ingrese el tempo de la cancion ");
            tempo = entrada_datos.nextInt();
            entrada_datos.nextLine();
            System.out.print("Ingrese la discografia en la que se grabo ");
            disco_grafia = entrada_datos.nextLine();
            System.out.print("Ingrese si sus integrantes son separados o no ");
            separados_integrantes = entrada_datos.nextLine();
            System.out.print("Ingrese si tiene un premio grami ");
            premio_grami = entrada_datos.nextLine();
            System.out.print("Ingrese si es popular la cancion ");
            popular = entrada_datos.nextLine();
            System.out.println();
            Cancion cancion = new Cancion(tempo, nombre_Cancion, Genero, instrumentos, nombre_banda, disco_grafia, separados_integrantes, anio_Fundacion, premio_grami, popular);
            
            Lista_Musica.add(cancion);
        }
    }

    //Otra forma de presentar datos sin un for each
    public void Mostar_Canciones2(){
        for (int i = 0; i< Lista_Musica.size();i++){
            System.out.println("Cancion "+(i+1));
            System.out.println(Lista_Musica.get(i));
        }
    }

    public void Mostar_Canciones (){
        for(Musica music : Lista_Musica){
           
            System.out.println();
            System.out.println(music.toString());
            System.out.println("");
        }
    }
    
}

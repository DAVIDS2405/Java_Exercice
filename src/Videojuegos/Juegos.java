//Pakage
package Videojuegos;

//Imports
import java.util.ArrayList;
import java.util.Scanner;

public class Juegos extends Nintendo {
   

    /*
     * La directiva static permite el acceso a métodos y variables de clase sin la
     * necesidad de instanciar un objeto de dicha clase, permitiendo la
     * inicialización de forma cómoda y durante la carga de clase.
    */

   //Scanner ocupamos static para no instanciar repetidas veces en donde necesitemos el Scanner
   private static Scanner entrada_datos = new Scanner(System.in);
   //Arraylist lo mimso para con arraylisto lo instanciamos como estatico para no instanciarlo una y otra vez
   private static ArrayList<Videojuegos> juegos_nintendo = new ArrayList<Videojuegos>();
   //Attribute
   private double Metacritic;

    //Constructor
    public Juegos(String tipo_Juego, String nombre_Juego, int numero_Jugadores, double precio_Juego,
        int anio_Publicacion, String edicion_Limitada, double metacritic) {
        super(tipo_Juego, nombre_Juego, numero_Jugadores, precio_Juego, anio_Publicacion, edicion_Limitada);
        Metacritic = metacritic;

        //Exepcion
        if (Metacritic < 0 || Metacritic > 100 ){
            throw new IllegalArgumentException(
                    "Metacritic acepta solo calificaciones de 0 a 100");
        }
    
    }

    /*
     * No se ocupo getter y setter ya que no fueron necesarios
     */


    //Methods
    //El metodo toString permite mostrar todo lo que este dentro del arreglo
    @Override
    public String toString() {
        //Ocupamos super para traer el metodo toString de Nintendo
        return super.toString()+"\nPuntuacion en Metacritic " + Metacritic; 
    }
    
    //Permite llenar el arreglo de juegos
    public void Llenar_Juegos(int Numero_Juegos) {

        //Variables

        int Anio_salida, Numero_Jugadores;
        String Nombre_Juego, Tipo_Juego, Edicion_Limitada;
        double Precio_Juego, Metacritic;

        //For para llenar el arreglo
        for (int i = 0; i < Numero_Juegos; i++) {
            System.out.println();
            System.out.println("Juego numero " + (i + 1));
            System.out.print("Ingrese el nombre del juego: ");
            Nombre_Juego = entrada_datos.nextLine();
            System.out.print("Ingrese que tipo de juego es: ");
            Tipo_Juego = entrada_datos.nextLine();
            System.out.print("Ingrese el numero de jugadores: ");
            Numero_Jugadores = entrada_datos.nextInt();
            System.out.print("Ingrese el precio de su juego: ");
            Precio_Juego = entrada_datos.nextDouble();
            System.out.print("Ingrese en que año salio: ");
            Anio_salida = entrada_datos.nextInt();
            System.out.print("Su juego es edicion limitada: ");
            Edicion_Limitada = entrada_datos.next();
            System.out.print("Ingrese la calificacion recibida en metacritic: ");
            Metacritic = entrada_datos.nextDouble();
            entrada_datos.nextLine(); // Capturamos los espacios para que no de error
            System.out.println();

            //Creacion del objeto dentro del arreglo para almacenar todo los juegos que el usuario necesita
            Juegos juego = new Juegos(Tipo_Juego, Nombre_Juego, Numero_Jugadores, Precio_Juego, Anio_salida,
                    Edicion_Limitada, Metacritic);
            //Añadimos lo que este en nuesto objeto de Juego para almacenar todo en el arreglo
            juegos_nintendo.add(juego);
        }
    }
    
    //Permite ver los juegos
    public void Mostrar_juegos() {
        for (Videojuegos games : juegos_nintendo) {
            System.out.println("");
            //Invocamos el toString de juegos para mostrar los juegos
            System.out.print(games.toString());
            System.out.println("");
        }
    }
   

    
}

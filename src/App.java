//Imports
import java.util.Scanner;

import Comida.Plato;
import Musica.Cancion;
import Videojuegos.Juegos;

public class App {
    private static Scanner entrada_datos = new Scanner(System.in);
    private static Juegos juegos = new Juegos(null, null, 0, 0, 0, null, 0);
    private static Cancion cancion = new Cancion(0, null, null, null, null, null, null, 0, null, null);
    private static Plato plato = new Plato(null, null, null, 0, null, null, null, null, null);
    public static void main(String[] args) throws Exception {
        
        int opcion = menu();
        
        
        while (opcion != 4){
            if (opcion == 1){
                int numero_juegos;
                System.out.print("ingrese el numero de cuantos juegos de Nintendo que va ingresar al sistema: ");
                numero_juegos = entrada_datos.nextInt();
                juegos.Llenar_Juegos(numero_juegos);
                System.out.println("");
                juegos.Mostrar_juegos();
                System.out.println("");


            }
            else if (opcion == 2){
                int numero_canciones;
                System.out.print("Ingrese cuantas canciones va a desear ");
                numero_canciones = entrada_datos.nextInt();
                cancion.LLenar_Canciones(numero_canciones);
                System.out.println("");
                cancion.Mostar_Canciones();
                // cancion.Mostar_Canciones2(); otra forma de presentar los datos
            }
            else{
                int numero_platos;
                System.out.print("Ingrese cuantas canciones va a desear ");
                numero_platos = entrada_datos.nextInt();
                plato.LLenar_Platos(numero_platos);
                System.out.println();
                plato.Mostrar_platos();
                

            }

            opcion = menu();
        }
    }


    private static int menu(){

        int opcion = 0;
        while (opcion < 1 || opcion > 4){
            System.out.println("Menu Ejercicios");
            System.out.println("1.- Videojuegos");
            System.out.println("2.- Musica");
            System.out.println("3.- Comida");
            System.out.println("4.- Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada_datos.nextInt();

            if(opcion < 1 || opcion > 4){
                throw new IllegalArgumentException("Ingrese solo numero validos en los que pude observar el menu");
            }
        }
        return opcion;
    }
    
}

import java.util.ArrayList;
import java.util.Scanner;

import Videojuegos.Juegos;
import Videojuegos.Videojuegos;

public class App {
    private static Scanner entrada_datos = new Scanner(System.in);
    private static ArrayList <Videojuegos> juegos_nintendo = new ArrayList<Videojuegos>();
    public static void main(String[] args) throws Exception {
        
        int opcion = menu();
        while (opcion != 4){
            if (opcion == 1){
                int numero_juegos;
                System.out.print("ingrese el numero de cuantos juegos de Nintendo que va ingresar al sistema: ");
                numero_juegos = entrada_datos.nextInt();

                Llenar_Juegos(numero_juegos);
                System.out.println("Juegos ingresados");
                Mostrar_juegos();

            }
            else if (opcion == 2){

            }
            else{

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

    private static void Llenar_Juegos(int Numero_Juegos){

        int Anio_salida, Numero_Jugadores;
        String Nombre_Juego, Tipo_Juego, Edicion_Limitada;
        double Precio_Juego, Metacritic;

        for (int i = 0; i < Numero_Juegos; i++) {
            System.out.println();
            entrada_datos.nextLine();
            System.out.println("Juego numero " +(i+1));
            System.out.print("Ingrese el nombre del juego: ");
            Nombre_Juego = entrada_datos.nextLine();
            System.out.print("Ingrese que tipo de juego es: ");
            Tipo_Juego = entrada_datos.nextLine();
            System.out.print("Ingrese el numero de jugadores: ");
            Numero_Jugadores = entrada_datos.nextInt();
            System.out.print("Ingrese el precio de su juego");
            Precio_Juego = entrada_datos.nextDouble();
            System.out.print("Ingrese en que año salio");
            Anio_salida = entrada_datos.nextInt();
            System.out.print("Su juego es edicion limitada: ");
            Edicion_Limitada = entrada_datos.next();
            System.out.print("Ingrese la calificacion recibida en metacritic");
            Metacritic = entrada_datos.nextDouble();
            System.out.println();

            Juegos juego = new Juegos(Tipo_Juego, Nombre_Juego, Numero_Jugadores, Precio_Juego, Anio_salida, Edicion_Limitada, Metacritic);
            juegos_nintendo.add(juego);
        }
    }

    private static void Mostrar_juegos(){
        for(Videojuegos games: juegos_nintendo){
            System.out.print(games.MostrarDatos());
        }
    }
}

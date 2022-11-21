
import java.util.Scanner;

public class Main {
    static Series series[] = new Series [5];
    static Videojuegos Videojuegos[] = new Videojuegos[5];
    static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int opcion = menu();
        int opcion_menu_secundario = menu_secundario();
        while(opcion != 3){

            if (opcion == 1){
               
               System.out.println("Series");
               while(opcion_menu_secundario !=4){

                if(opcion == 1){
                    String titulo , genero, creador;
                    int temporadas;
                    for (int i = 0 ; i < series.length; i++){
                        System.out.println("");
                        System.out.println("Datos a ingresar");
                        System.out.println("Serie " + (i+1));
                        System.out.print("Titulo ");
                        titulo = sn.nextLine();
                        System.out.println("Temporadas");
                        temporadas = sn.nextInt();
                        System.out.println("Genero");
                        genero = sn.nextLine();
                        System.out.println("Creador");
                        creador = sn.nextLine();

                        series[i] = new Series(titulo, temporadas, genero, creador);

                    }

                }
                else if (opcion == 2){

                }

                else if (opcion == 3){

                }

                else if (opcion == 4){

                }

                opcion_menu_secundario = menu_secundario();
               }
                
                
            }

            else if (opcion == 2){
                System.out.println("Juegos");
               while(opcion_menu_secundario !=4){

                if(opcion == 1){

                }
                else if (opcion == 2){

                }

                else if (opcion == 3){

                }

                else if (opcion == 4){

                }

                opcion_menu_secundario = menu_secundario();
               }
                
            }

            else if (opcion == 3){
                System.exit(0);
               
            }
            

            opcion = menu();
        }
        
    }


    //Menu principal
    public static int menu(){
        int opcion = 0;

        while (opcion > 3 || opcion < 1 ){
            System.out.println("");
            System.out.println("RENTA DE SERIES Y VIDEOJUEGOS");
            System.out.println("1.- Series");
            System.out.println("2.- Juegos");
            System.out.println("3.- Salir");
            System.out.print("Ingrese una opcion ");
            opcion = sn.nextInt();
            if (opcion > 3 || opcion < 1){
                System.out.println("ingrese un valor entre 1 y 3");
            }
        }
        return opcion;
    }

    //Menu secundario para series y juegos
    public static int menu_secundario(){
        int opcion = 0;

        while (opcion > 3 || opcion < 1 ){
            System.out.println("");
            System.out.println("1.- Ingresar Datos");
            System.out.println("2.- Ver cuales estan disponibles");
            System.out.println("3.- Rentar");
            System.out.println("4.- Salir al menu principal");
            System.out.print("Ingrese una opcion ");
            opcion = sn.nextInt();
            if (opcion > 3 || opcion < 1){
                System.out.println("ingrese un valor entre 1 y 3");
            }
        }
        return opcion;
    }

    //Mostrar datos series
    public static void Mostrar_datos(){
        for (Series Mostrar_Series: series){
            System.out.println(Mostrar_Series.toString());
        }
    }
    
    //Mostrar datos Juegos
}

package Comida;

import java.util.ArrayList;
import java.util.Scanner;

public class Plato extends Region {

    private static Scanner entrada_datos = new Scanner(System.in);
    private static ArrayList<Comida> Lista_Comida = new ArrayList<Comida>();
    
            
    private String Nombre_Plato,Calificacion;

    public Plato(String ingredientes, String tiempo_Coccion, String pasos_seguir, int precio, String pais,
            String region, String continente, String nombre_Plato, String calificacion) {
        super(ingredientes, tiempo_Coccion, pasos_seguir, precio, pais, region, continente);
        Nombre_Plato = nombre_Plato;
        Calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNombre del plato " + Nombre_Plato + "\nCalificacion del plato " + Calificacion;
    }

     public void LLenar_Platos(int num_platos){
            for(int i = 0 ; i < num_platos ; i++){
                int precio;
                String ingredientes, tiempo_coccion, pasos_seguir, pais, region, continente, nombre_Plato, calificacion;
                System.out.println();
                System.out.print("Ingrese el nombre de su plato ");
                nombre_Plato = entrada_datos.nextLine();
                System.out.print("Ingrese los ingredientes de su plato ");
                ingredientes = entrada_datos.nextLine();
                System.out.print("Ingrese el tiempo de coccion de su plato ");
                tiempo_coccion = entrada_datos.nextLine();
                System.out.print("Ingrese los pasos de su platillo ");
                pasos_seguir = entrada_datos.nextLine();
                System.out.print("Ingrese el precio de su plato ");
                precio = entrada_datos.nextInt();
                entrada_datos.nextLine();
                System.out.print("Ingrese el pais de su plato ");
                pais = entrada_datos.nextLine();
                System.out.print("Ingrese la region de su plato ");
                region = entrada_datos.nextLine();
                System.out.print("Ingrese el continente de su pais ");
                continente = entrada_datos.nextLine();
                System.out.print("Ingrese la calificacion de su plato ");
                calificacion = entrada_datos.nextLine();
                System.out.println();

                Plato plato = new Plato(ingredientes, tiempo_coccion, pasos_seguir, precio, pais, region, continente, nombre_Plato, calificacion);
                
                Lista_Comida.add(plato);
      
            }
     }
    
     public void Mostrar_platos(){
        for(Comida plato: Lista_Comida){
            System.out.println("");
            // Invocamos el toString de juegos para mostrar los juegos
            System.out.print(plato.toString());
            System.out.println("");
        }
     }
}

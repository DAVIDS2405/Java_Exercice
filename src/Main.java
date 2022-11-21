
import java.util.Scanner;

public class Main {
    
    static Scanner sn = new Scanner(System.in);
    static Cuenta cuenta = new Cuenta();
    public static void main(String[] args) throws Exception {
        double dinero;
        String Titular;
        int opcion = menu();
        while(opcion != 5){

            if (opcion == 1){
                System.out.println("");
                System.out.println("Datos de la cuenta");
                System.out.println("Ingrese el nombre del titular de la cuenta");
                Titular = sn.nextLine();
                sn.nextLine();
                cuenta.setTitular_de_cuenta(Titular);
                System.out.print("Ingrese su dinero actual ");
                dinero = sn.nextDouble();
                if (dinero < 1){
                    System.out.println("No puede ingresar dinero menor a 1 dolar");
                }
                cuenta.setDinero_en_cuenta(dinero);
                
            }

            else if (opcion == 2){
                System.out.println("");
                System.out.println("Ingreso");
                System.out.print("Cuanto dinero desea ingresar ");
                dinero = sn.nextDouble();
                cuenta.Agregar_Dinero(dinero);
            }

            else if (opcion == 3){
                System.out.println("Retiro");
                System.out.print("Cuanto dinero desea retirar ");
                dinero = sn.nextDouble();
                cuenta.Retirar_Dinero(dinero);
                
            }
            else if (opcion == 4){
                cuenta.Mostrar_Cuenta();
            }
            else if (opcion == 5){
                System.exit(0);
            }

            opcion = menu();
        }
        
    }


    //Menu principal
    public static int menu(){
        int opcion = 0;

        while (opcion > 5 || opcion < 1 ){
            System.out.println("");
            System.out.println("BANCO DEL PICHINCHA");
            System.out.println("1.- Ingresar datos de la cuenta");
            System.out.println("2.- Ingresar Dinero");
            System.out.println("3.- Retirar");
            System.out.println("4.- Ver cuenta");
            System.out.println("5.- salir");
            System.out.print("Ingrese una opcion ");
            opcion = sn.nextInt();
            if (opcion > 5 || opcion < 1){
                System.out.println("ingrese un valor entre 1 y 3");
            }
        }
        return opcion;
    }
}

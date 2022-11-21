import java.util.Scanner;

public class Main {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int opcion = menu();
        while(opcion != 3){

            if (opcion == 1){
                System.out.println("opcion 1");
            }

            else if (opcion == 2){
                System.out.println("opcion 2");
            }

            else if (opcion == 3){
                System.out.println(" fin del programa");
                System.exit(0);
            }

            opcion = menu();
        }
        
    }


    //Menu principal
    public static int menu(){
        int opcion = 0;

        while (opcion > 3 || opcion < 0 ){
            System.out.println("BANCO DEL PICHINCHA");
            System.out.println("1.- Ingresar Dinero");
            System.out.println("2.- Retirar");
            System.out.println("3.- Salir");
            System.out.print("Ingrese una opcion");
            opcion = sn.nextInt();
            if (opcion > 3 || opcion < 0){
                System.out.println("ingrese un valor entre 1 y 3");
            }
        }
        return opcion;
    }
}

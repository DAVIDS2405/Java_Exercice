import java.util.Scanner;

public class Main {
    static Scanner sn = new Scanner(System.in);
    static Cajero Persona1 = new Cajero();
    public static void main(String[] args) throws Exception {
        
        int opcion_Menuprincipal = menu_principal();
        int contrasenia;
        String Titular;
        double dinero;
        String depositar;
        while(opcion_Menuprincipal != 2){

            if (opcion_Menuprincipal == 1){

                sn.nextLine();
                System.out.println("ingrese el nombre del titular de la cuenta");
                Titular = sn.nextLine();
                System.out.println("Cuanto dinero tiene ");
                dinero = sn.nextDouble();
                Persona1.setDinero_cuenta(dinero);
                Persona1.setPersona_titular_cuenta(Titular);
                System.out.println("");
                int opcion_Menusecundario = menu_secundario();
                while (opcion_Menusecundario != 5){
                    if (opcion_Menusecundario == 1){
                        
                        System.out.print("ingrese la contraseña de su tarjeta");
                        contrasenia = sn.nextInt();
                        if (contrasenia == 1234 ){
                            sn.nextLine();
                            System.out.println("");
                            System.out.println("ingrese el nombre de la persona a quien se depositara");
                            depositar = sn.nextLine();
                            System.out.print("Cuanto dinero desea depositar: ");
                            dinero = sn.nextDouble();
                            Persona1.Depositar_dinero(dinero);
                            System.out.println("se deposito " + dinero+ "$ a " + depositar );
                        }
                        else if (contrasenia != 1234){
                            System.out.println(" no es su contraseña la correcta");
                        }
                       

                    }
                    else if (opcion_Menusecundario == 2){
                        System.out.print("ingrese la contraseña de su tarjeta");
                        contrasenia = sn.nextInt();
                        if (contrasenia == 1234 ){
                            System.out.println("cuanto dinero desea retirar");
                            dinero = sn.nextDouble();
                            Persona1.Retirar_dinero(dinero);

                        }
                        else{
                            System.out.println(" no es su contraseña la correcta");
                        }
                        
                    }
                    else if (opcion_Menusecundario == 3){
                        System.out.print("ingrese la contraseña de su tarjeta");
                        contrasenia = sn.nextInt();
                        if (contrasenia == 1234 ){
                            System.out.println("Cuanto dinero desea ingresar");
                            dinero = sn.nextDouble();
                            Persona1.Ingresar_dinero(dinero);
                        }
                        else{
                            System.out.println(" no es su contraseña la correcta");
                        }
                        

                    }
                    else if (opcion_Menusecundario == 4){
                        System.out.println(Persona1.getDinero_cuenta());
                        System.out.println(Persona1.getPersona_titular_cuenta());
                    }

                    opcion_Menusecundario = menu_secundario();
                }
                
            }
           

            opcion_Menuprincipal = menu_principal();

        }
        

        
    }


    //Menu principal

    public static int menu_principal(){
        int opcion = 0;
        while(opcion > 2 || opcion < 1){
            System.out.println("Bancho Pichincha");
            System.out.println("1.- Ingresar tarjeta");
            System.out.println("2.- Salir");
            System.out.print("ingrese una opcion ");
            opcion = sn.nextInt();
            if (opcion > 2 || opcion < 1){
                System.out.println("ingrese una opcion valida entre 1 y 2");
            }
        }

        return opcion;
    }
    
    //Menu Secundario
    public static int menu_secundario(){
        int opcion = 0;
        while(opcion > 5 || opcion < 1){
            System.out.println("Bancho Pichincha");
            System.out.println("1.- Depósitar dinero");
            System.out.println("2.- Retirar dinero");
            System.out.println("3.- Ingresar dinero");
            System.out.println("4.- Ver dinero en la cuenta");
            System.out.println("5.- Salir");
            System.out.print("ingrese una opcion ");
            opcion = sn.nextInt();

            if (opcion >5 || opcion < 1){
                System.out.println("ingrese una opcion valida entre 1 y 4");
            }
        }

        return opcion;
    }

    
}

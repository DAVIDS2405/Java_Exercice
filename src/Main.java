public class Main {
    public static void main(String[] args) throws Exception {

        int opcion_Menuprincipal = menu_principal();
        int opcion_Menusecundario = menu_secundario();
        while(opcion_Menuprincipal != 2){

            if (opcion_Menuprincipal == 1){
               

                while (opcion_Menusecundario !=4){
                    if(opcion_Menusecundario == 1){

                    }
                    else if ( opcion_Menusecundario == 2){

                    }
                    else if (opcion_Menusecundario == 3){

                    }
                    else if ( opcion_Menusecundario ==4 ){
                        System.exit(0);
                    }


                    opcion_Menusecundario = menu_secundario();
                }
                
            }
            else{
                System.exit(0);
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

            if (opcion >2 || opcion < 1){
                System.out.println("ingrese una opcion valida entre 1 y 2");
            }
        }

        return opcion;
    }
    
    //Menu Secundario
    public static int menu_secundario(){
        int opcion = 0;
        while(opcion > 4 || opcion < 1){
            System.out.println("Bancho Pichincha");
            System.out.println("1.- Ingresar dinero");
            System.out.println("2.- Depósitar dinero");
            System.out.println("3.- Retirar dinero");
            System.out.println("4.- Salir");

            if (opcion >4 || opcion < 1){
                System.out.println("ingrese una opcion valida entre 1 y 4");
            }
        }

        return opcion;
    }

    
}

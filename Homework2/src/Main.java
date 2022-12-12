import javax.swing.JOptionPane;




public class Main {
    //array que nos permite ingresar nuestros vehiculos
     static Vehiculos vehiculos = new Vehiculos(null, null, null, null, null, 0, null, 0);
    //Main
    public static void main(String[] args) throws Exception {

        int opcion = menu();
        while(opcion != 3){
            if (opcion == 1){
                
                vehiculos.Llenar_Vehiculos();

            }

            else if (opcion == 2){
                vehiculos.Ver_Vehiculos();
                
            }
            //Nuevamente regresamos al menu principal para seguir hasta que se ingrese el numero 3
            opcion = menu();
        }

        
    }

    //Menu para poder ver y acceder a las opciones para ingresar vehiculo como verlos
    public static int menu() {
        int opcion = 0;
        while ((opcion > 3) || (opcion < 1)){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Vehiculos\n" 
                +"1.- Ingresar Vehiculos\n"
                +"2.- Ver Vehiculos\n"
                +"3.- Salir"));
        } 
        return opcion;
    }

}


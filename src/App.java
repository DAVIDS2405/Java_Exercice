import javax.swing.JFrame;



public class App extends JFrame {
    public App(){
        super("Graficas ");
        setSize(600,400);
        setVisible(true);
    }

    
    public static void main(String[] args) throws Exception {
        App aplicacion = new App();
        Dibujos2D_3D dibujo = new Dibujos2D_3D();
        aplicacion.add(dibujo);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

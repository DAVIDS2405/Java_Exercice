
import javax.swing.JPanel;

import java.awt.Graphics;

public class Dibujos2D_3D extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10, 10, 10, 90);
        g.drawArc(-40, 10, 100, 80, 90, -180);

        g.drawLine(150, 150, 150, 230);
        g.drawArc(100, 150, 100, 80, 90, -180);

        g.drawLine(150, 150, 150, 230);

        g.drawLine(145, 145, 145, 230);
        g.drawArc(127, 143, 70, 70, 1, 140);
        
        g.drawArc(100, 150, 100, 80, 90, -180);

        g.drawLine(170, 170, 170, 210);
        

        g.drawArc(150, 170, 40, 40, 90, -180);
        g.drawArc(150, 170, 35, 42, 90, -160);
       
    }

}

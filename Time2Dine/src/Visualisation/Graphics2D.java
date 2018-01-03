import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;

/*We will be inserting this class into the Panel in GUI for the Canteen
visualisation right? Yes.
 */

public class Graphics2D extends JPanel {


    public Graphics2D() {
        this.setVisible(true);
        repaint();
    }

    public void visualize(Chromosome chromosome){

    }

    @Override
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        this.setBounds(6,6,586,506);
        super.paintComponent(g);

        int point1 = 100;
        int point2 = 250;
        int point3 = 400;
        int dt = 1; //cause of line thickness, needed to fill polygon properly

        int yBorderPoly[] = {point1,point1,point2,point2,point3,point3};
        int xBorderPoly[] = {point1,point2,point2,point3,point3,point1};
        Polygon borderPoly = new Polygon(xBorderPoly, yBorderPoly, xBorderPoly.length);

        int yFilledPoly[] = {point1+dt,point1+dt,point2+dt,point2+dt,point3-dt,point3-dt};
        int xFilledPoly[] = {point1+dt,point2-dt,point2-dt,point3-dt,point3-dt,point1+dt};
        Polygon filledPoly = new Polygon(xFilledPoly, yFilledPoly, xFilledPoly.length);

        g.setColor(Color.BLACK);
        g.drawPolygon(borderPoly);
        g.setColor(Color.YELLOW);
        g.fillPolygon(filledPoly);
    }
}

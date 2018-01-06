import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*We will be inserting this class into the Panel in GUI for the Canteen
visualisation right? Yes.
 */

public class Graphics2D extends JPanel {

    private BufferedImage chair = null;
    private BufferedImage table = null;
    private BufferedImage lamp= null;

    public Graphics2D() {
        this.setVisible(true);

        try {
            chair = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\chair.png"));
            table = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\4Table.png"));
            lamp = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\lamp.png"));
        } catch (IOException e) {
            System.out.println("Nie znaleziono obrazka!");
        }

        repaint();
    }

    public void visualize(Chromosome chromosome){

    }

    @Override
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        this.setBounds(6,6,586,506);
        super.paintComponent(g);

        int point1 = 10;
        int point2 = 450;
        int point3 = 500;
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

        g.drawImage(chair,30, 30, null);
        g.drawImage(table,100, 100, null);
        g.drawImage(table,230, 240, null);
        g.drawImage(table,350, 150, null);
        g.drawImage(lamp,100, 100, null);
        g.drawImage(lamp,200, 100, null);
        g.drawImage(lamp,300, 100, null);
        g.drawImage(lamp,100, 200, null);
        g.drawImage(lamp,100, 300, null);

    }
}

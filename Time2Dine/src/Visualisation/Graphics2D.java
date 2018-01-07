import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Graphics2D extends JPanel {

    private BufferedImage chair = null;
    private BufferedImage table4 = null;
    private BufferedImage table6 = null;
    private BufferedImage table8 = null;
    private BufferedImage lamp= null;
    private BufferedImage bench= null;

    private BufferedImage savePicture;

    public Graphics2D() {
        this.setVisible(true);

        try {
            chair = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\chair.png"));
            table4 = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\4Table.png"));
            table6 = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\6Table.png"));
            table8 = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\8Table.png"));
            lamp = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\lamp.png"));
            bench = ImageIO.read(new File("Time2Dine\\src\\ComponentsImage\\benchSmall.png"));
        } catch (IOException e) {
            System.out.println("Nie znaleziono obrazka!");
        }
        this.setBounds(6,6,586,506);

        savePicture = new BufferedImage(this.getSize().width, this.getSize().height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = savePicture.createGraphics();
        this.paint(g);
        g.dispose();
        repaint();
    }

    public void visualize(Chromosome chromosome){

    }

    @Override
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        this.setBounds(6,6,586,506);
        super.paintComponent(g);

        int point1 = 0;
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
       // g.setColor(Color.YELLOW);
      //  g.fillPolygon(filledPoly);

    //   g.drawImage(chair,30, 30, null);
       // g.drawImage(bench,350,250,400,250,400,200,350,200,null);
      //  g.drawImage(bench,350,250,400,400,0,0,50,300,null);
       // g.drawImage(chair,0,0,300,300,0,0,50,300,null);
       /* double rotationRequired = Math.toRadians (90);
        double locationX = chair.getWidth() / 2;
        double locationY = chair.getHeight() / 2;
        AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);

        g.drawImage(op.filter(chair, null), 30, 30, null);*/
        //drawRotate(chair,0,150,150,g,1,1);

      //  drawRotate(chair,180,150,150,g,1,1);
        //drawRotate(chair,270,150,150,g,1,1);
        drawRotate(chair,0,27,30,g,1,1);
        drawRotate(chair,0,52,30,g,1,1);
        drawRotate(chair,0,77,30,g,1,1);
        drawRotate(chair,0,102,30,g,1,1);
        drawRotate(chair,0,127,30,g,1,1);
        drawRotate(chair,0,152,30,g,1,1);
        drawRotate(chair,0,177,30,g,1,1);
        drawRotate(chair,0,202,30,g,1,1);
        drawRotate(bench,0,23,55,g,1,1);
        drawRotate(bench,0,121,55,g,1,1);
        drawRotate(lamp,0,200,200,g,1,1);

    }
    private static void drawRotate(BufferedImage img, double angle , int locationX, int locationY,Graphics g, double xScale, double yScale){
        AffineTransform tx = AffineTransform.getRotateInstance(Math.toRadians(angle), img.getWidth()/2, img.getHeight()/2);
        tx.scale(xScale,yScale);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        g.drawImage(op.filter(img, null), locationX, locationY, null);
    }

    public BufferedImage getSavePicture() {
        return savePicture;
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Graphics2D extends JPanel {

    private BufferedImage chair = null;
    private BufferedImage table4 = null;
    private BufferedImage table6 = null;
    private BufferedImage table8 = null;
    private BufferedImage lamp = null;
    private BufferedImage bench = null;
    private Canteen canteen = null;
    private Chromosome chromosome = null;

    private BufferedImage savePicture;

    public Graphics2D(Canteen canteen ,Chromosome chromosome) {
        this();
        this.canteen = canteen;
        this.chromosome = chromosome;

        this.setBounds(6, 6, 586, 586);
        savePicture = new BufferedImage(this.getSize().width, this.getSize().height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = savePicture.createGraphics();
        this.setVisible(true);
    }

    public Graphics2D() {
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
    }
    @Override
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        super.paintComponent(g);
        try {
            drawCanteen(g);
            drawFurnitures(g);
        } catch (NullPointerException ex) {
            repaint();
        }
    }
    public void draw() {
        repaint();
    }
    public void drawFurnitures(Graphics g) {
        ArrayList<Furniture> furList = chromosome.getFurList();
        for(Furniture f : furList) {
            BufferedImage img = chair;
            System.out.println(f.getKey().name());
            switch(f.getKey().name()){
                case "FOURPTABLE": img = table4; break;
                case "SIXPTABLE": img = table6; break;
                case "EIGHTPTABLE": img = table8; break;
                case "CHAIR": img = chair; break;
                case "SMALLBENCH": img = bench; break;
                case "BIGBENCH": img = bench; break;
                case "LOWILUM": img = lamp; break;
                case "MEDILUM": img = lamp; break;
                case "STRONGILUM": img = lamp; break;
            }
            drawRotate(img,0, f.getX1Position(), f.getY1Position(), g, 1, 1); // TODO: change furniture;
        }
    }

    private void drawRotate(BufferedImage img, double angle, int locationX, int locationY, Graphics g, double xScale, double yScale) {
        AffineTransform tx = AffineTransform.getRotateInstance(Math.toRadians(angle), img.getWidth() / 2, img.getHeight() / 2);
        tx.scale(xScale, yScale);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        g.drawImage(op.filter(img, null), locationX, locationY, null);
    }

    /*Błąd w rzędu  <= 0,5%Punkt startu (0,0)*/
    private void drawCanteen(Graphics g) {
        double meterToPixel = 37.74;
        int point2 = (int) (meterToPixel * canteen.gettWall());
        int point3 = (int) ((meterToPixel * (canteen.getlWall() - canteen.getrWall())));
        int point4 = (int) (Math.abs(meterToPixel * (canteen.getbWall() - canteen.gettWall())) + point2);
        int point5 = (int) (Math.abs(meterToPixel * (canteen.getrWall())) + point3);
        int yBorderPoly[] = {0, 0, point3, point3, point5, point5};
        int xBorderPoly[] = {0, point2, point2, point4, point4, 0};
        Polygon borderPoly = new Polygon(xBorderPoly, yBorderPoly, xBorderPoly.length);
        g.setColor(Color.BLACK);
        g.drawPolygon(borderPoly);
    }


    public BufferedImage getSavePicture() {
        return savePicture;
    }

    public void setCanteen(Canteen canteen) {
        this.canteen = canteen;
    }

    public void setChromosome(Chromosome chromosome) {
        this.chromosome = chromosome;
    }
}

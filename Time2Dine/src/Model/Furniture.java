public class Furniture {

    private FurnitureEnum key;
    private int x1Position;
    private int y1Position;
    private int x2Position;
    private int y2Position;
    private double furCost;
    /*Here i have not really thought about "size" of the furniture. I mean
    if we are generating  chromosome, positions generated through that method
    should indicate the size of the table , chair etc, and they should be the same
    I think we can skip creating variable concerning the size problem.
     */

    public Furniture(FurnitureEnum key, int x1Position, int y1Position, int x2Position, int y2Position, double furCost) {
        this.key = key;
        this.x1Position = x1Position;
        this.y1Position = y1Position;
        this.x2Position = x2Position;
        this.y2Position = y2Position;
        this.furCost = furCost;
    }

    public Furniture(FurnitureEnum key, int x1Position, int y1Position) {
        this.key = key;
        this.x1Position = x1Position;
        this.y1Position = y1Position;
    }

    public double getFurCost() {
        return furCost;
    }

    public int getX1Position() {
        return x1Position;
    }

    public int getY1Position() {
        return y1Position;
    }
}

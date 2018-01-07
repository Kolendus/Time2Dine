public class Furniture {

    private FurnitureEnum key;
    private double aPosition;
    private double bPosition;
    private double cPosition;
    private double dPosition;
    private double furCost;
    /*Here i have not really thought about "size" of the furniture. I mean
    if we are generating  chromosome, positions generated through that method
    should indicate the size of the table , chair etc, and they should be the same
    I think we can skip creating variable concerning the size problem.
     */

    public Furniture(FurnitureEnum key, double aPosition, double bPosition, double cPosition, double dPosition, double furCost) {
        this.key = key;
        this.aPosition = aPosition;
        this.bPosition = bPosition;
        this.cPosition = cPosition;
        this.dPosition = dPosition;
        this.furCost = furCost;
    }

    public Furniture(FurnitureEnum key, double aPosition, double bPosition) {
        this.key = key;
        this.aPosition = aPosition;
        this.bPosition = bPosition;
    }

    public double getFurCost() {
        return furCost;
    }
}

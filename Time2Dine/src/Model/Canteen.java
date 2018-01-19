import java.util.HashMap;
import java.util.Map;

public class Canteen {
    public static final double METER_TO_PIXEL = 37.74;

    private double bWall;
    private double tWall;
    private double rWall;
    private double lWall;

    private int maxPixelX;
    private int maxPixelY;

    private int budget;
    private Evaluate evaluate;

    private Map<FurnitureEnum, Double> costs;

    public Canteen(int budget) {
        costs = new HashMap<>();
        evaluate = new Evaluate();
        this.budget = budget;
    }

    public boolean setWalls(double bWall, double tWall, double rWall, double lWall) {
        this.bWall = bWall;
        this.tWall = tWall;
        this.rWall = rWall;
        this.lWall = lWall;

        maxPixelX = getInPixels(bWall);
        maxPixelY = getInPixels(lWall);

        //return validateWallsPerimeters();
        return true;
    }

    public void setCost(FurnitureEnum key, double value) {
        costs.put(key, value);
    }

    public double getCost(FurnitureEnum key) {
        return costs.get(key);
    }

    public boolean validateWallsPerimeters() {
        double leftArea, rightArea;
        leftArea = lWall * tWall;
        rightArea = (bWall - tWall) * rWall;
        if (leftArea < 18 || rightArea < 18) {
            return false;
        }
        return true;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public double getbWall() {
        return bWall;
    }

    public double gettWall() {
        return tWall;
    }

    public double getrWall() {
        return rWall;
    }

    public double getlWall() {
        return lWall;
    }

    public int getInPixels(double wallLength) {
        return (int) (wallLength * METER_TO_PIXEL);
    }

    public int getMaxPixelX() {
        return maxPixelX;
    }

    public int getMaxPixelY() {
        return maxPixelY;
    }

    public int getMaxPixelX(int pixelY) {
        return pixelY > lWall - rWall ? getInPixels(bWall) : getInPixels(bWall - tWall);
    }

}

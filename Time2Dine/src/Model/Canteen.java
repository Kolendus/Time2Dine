import java.util.HashMap;
import java.util.Map;

public class Canteen {
    private double bWall;
    private double tWall;
    private double rWall;
    private double lWall;

    private int maxX;
    private int maxY;

    private int budget;
    private Evaluate evaluate;


    /*I thought that it would be better if we used a Map
        interface for costs, cause there will be hella lot of them
        we can get them by specifying key value for example:
        One-person table - "1ptable" etc
        i guess its better than having 12323 variables
         */
    private Map<String,Double > costs;

    public Canteen(){
        costs = new HashMap<>();
        evaluate = new Evaluate();
    }

    public boolean setWalls(double bWall, double tWall, double rWall, double lWall){
        this.bWall = bWall;
        this.tWall = tWall;
        this.rWall = rWall;
        this.lWall = lWall;
        return validateWallsPerimeters();
    }

    public void setCost(String key, double value){
        costs.put(key,value);
    }
    public double getCost(String key){
        return costs.get(key);
    }

    /* number 18 is estimated area needed for 3 6-person
    tables in a diner. We are assuming that both parts of the diner
    has to be able to fit at least 6 6-person tables. It is
    supposed to be school diner duh. In addition bWall has to be bigger than tWall
    to avoid not creating L-shaped canteen
     */
    public boolean validateWallsPerimeters(){
        double leftArea,rightArea;
        leftArea = lWall*tWall;
        rightArea = (bWall-tWall)*rWall;
        if(leftArea < 18 || rightArea < 18 ){
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

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
}

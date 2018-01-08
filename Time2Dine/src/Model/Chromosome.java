import java.util.ArrayList;
import java.util.Random;

public class Chromosome {
    private ArrayList<Furniture> furList;
    private ArrayList<Boolean> chromosomeArray;

    private int cost;
    private double evaluationPoints;
    boolean canteenMap[][]; // free place = false, occupied place = true

    public Chromosome(Canteen canteen) {
        this.furList = new ArrayList<>();
        this.chromosomeArray = new ArrayList<>();
        this.cost = 0;
        canteenMap = new boolean[canteen.getMaxPixelX()][canteen.getMaxPixelY()];
        fillChromosome(canteen);
    }

    public void fillChromosome(Canteen canteen) {

        ArrayList<Furniture> furnitureList = new ArrayList<>(); // I will draw only in this array, not sure if every furniture should have same chance. If so, we need also another set/list.
        Random random = new Random();

        while (cost <= canteen.getBudget()) {
            for (int y = 0; y < canteen.getMaxPixelY(); y++) {
                for (int x = 0; x < canteen.getMaxPixelX(y); y++) {
                    for (FurnitureEnum furnitureEnum : FurnitureEnum.values()) {
                        if (checkPosition(x, y, furnitureEnum)) {
                            furnitureList.add(new Furniture(furnitureEnum, x, y)); // Using bad constructor to furniture but maybe furniture class should know by itself which will be x2 and y2?
                        }
                    }
                }
            }
            if (!furnitureList.isEmpty()) {
                Furniture furniture = furnitureList.get(random.nextInt(furnitureList.size()));
                addFurniture(furniture);
                cost += furniture.getFurCost();
            } else break; // No place for any furniture
        }

        furnituresToBytes(canteen);
    }

    private boolean checkPosition(int x, int y, FurnitureEnum furnitureEnum) {
        // <------------------------------- TO DO -------------------------------------------------->
        return true;
    }

    public void addFurniture(Furniture furniture) {
        furList.add(furniture);
    }

    public void furnituresToBytes(Canteen canteen) {
        for (Furniture fur : furList) {
            fillBinaryChromosomeList(kindOfFurniture(fur)); //4 bytes
            fillBinaryChromosomeList(squareOfFurniture(canteen, fur)); // 1 byte;
            fillBinaryChromosomeList(fur.getX1Position());  //9 bytes
            fillBinaryChromosomeList(fur.getY1Position());  //9 bytes
        }
    }

    public int squareOfFurniture(Canteen canteen, Furniture furniture) {
        return furniture.getX1Position() < canteen.getInPixels(canteen.gettWall()) ? 0 : 1;
    }

    public int kindOfFurniture(Furniture fur) {
        // <------------------------------- TO DO -------------------------------------------------->
        return 1;
    }

    public void fillBinaryChromosomeList(int number) {
        // <------------------------------- TO DO -------------------------------------------------->;
    }

    public void setEvaluationPoints(double evaluationPoints) {
        this.evaluationPoints = evaluationPoints;
    }
}

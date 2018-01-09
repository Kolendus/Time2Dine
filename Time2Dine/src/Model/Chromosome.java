import java.util.ArrayList;
import java.util.Arrays;
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
        Arrays.fill(canteenMap, false);
        fillChromosome(canteen);
    }

    // ----------------------------- Main algorithm making chromosome -----------------------------
    public void fillChromosome(Canteen canteen) {

        ArrayList<Furniture> furnitureList = new ArrayList<>(); // I will draw only in this array, not sure if every furniture should have same chance. If so, we need also another set/list.
        Random random = new Random();

        while (cost <= canteen.getBudget()) {
            for (int y = 0; y < canteen.getMaxPixelY(); y++) {
                for (int x = 0; x < canteen.getMaxPixelX(y); y++) {
                    for (FurnitureEnum furnitureEnum : FurnitureEnum.values()) {
                        if (checkPosition(x, y, furnitureEnum)) {
                            updatePosition(x, y, furnitureEnum);
                            furnitureList.add(new Furniture(furnitureEnum, x, y));
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

    // ----------------------------- Helping functions -----------------------------
    private boolean checkPosition(int x, int y, FurnitureEnum furnitureEnum) {
        // <------------------------------- TODO -------------------------------------------------->
        // Case for every furniture

        for (int xPos = x; xPos < x + furnitureEnum.getWidth(furnitureEnum); xPos++) {
            for (int yPos = y; yPos < y + furnitureEnum.getHeight(furnitureEnum); yPos++) {
                if (canteenMap[xPos][yPos])
                    return false;
            }
        }
        return true;
    }

    private void updatePosition(int x, int y, FurnitureEnum furnitureEnum) {
        for (int xPos = x; xPos < x + furnitureEnum.getWidth(furnitureEnum); xPos++) {
            for (int yPos = y; yPos < y + furnitureEnum.getHeight(furnitureEnum); yPos++) {
                canteenMap[xPos][yPos] = true;
            }
        }
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
        return fur.getKey().getNumberOfFurniture(fur.getKey());
    }

    public void fillBinaryChromosomeList(int number) {
        String binaryString = Integer.toBinaryString(number);
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            boolean elementToAdd = binaryString.indexOf(i) == 1 ? true : false;
            chromosomeArray.add(elementToAdd);
        }
    }

    public void setEvaluationPoints(double evaluationPoints) {
        this.evaluationPoints = evaluationPoints;
    }

    public void addFurniture(Furniture furniture) {
        furList.add(furniture);
    }
}

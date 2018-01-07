import java.util.ArrayList;
import java.util.Random;

public class Chromosome {
    private ArrayList<Furniture> furList;
    private int cost;
    private boolean[] chromosomeArray;
    private double evaluationPoints;
    boolean canteenMap[][]; // free place = false, occupied place = true

    public Chromosome(Canteen canteen) {
        this.furList = new ArrayList<>();
        this.cost = 0;
        canteenMap = new boolean [canteen.getMaxX()][canteen.getMaxY()];
        fillChromosome(canteen);
    }

    public void fillChromosome(Canteen canteen) {

        ArrayList<Furniture> furnitureList = new ArrayList<>(); // I will draw only in this array, not sure if every furniture should have same chance. If so, we need also another set/list.

        while(cost <= canteen.getBudget()) {
            for(int x = 0; x < canteen.getMaxX(); x++) { // Need to find probably better way to iterate over canteen
                for(int y = 0; y < canteen.getMaxY(); y++) {
                    for(FurnitureEnum furnitureEnum : FurnitureEnum.values()) {
                        if(checkPosition(x,y,furnitureEnum)) {
                            furnitureList.add(new Furniture(furnitureEnum,x,y)); // Using bad constructor to furniture but maybe furniture class should know by itself which will be x2 and y2?
                        }
                    }
                }
            }
            if(!furnitureList.isEmpty()) {
                Random random = new Random();
                Furniture furniture = furnitureList.get(random.nextInt(furnitureList.size()));
                addFurniture(furniture);
                cost += furniture.getFurCost();
            } else break; // No place for any furniture
        }
    }

    private boolean checkPosition(int x, int y, FurnitureEnum furnitureEnum) {
        // <------------------------------- TO DO -------------------------------------------------->
        // We have to figure out somehow which size is every FurnitureEnum to iterate
        return true;
    }

    public void addFurniture(Furniture furniture) {
        furList.add(furniture);
    }

    public boolean[] createCromosomeArray() {
        return null;
    }

    public void setEvaluationPoints(double evaluationPoints) {
        this.evaluationPoints = evaluationPoints;
    }
}

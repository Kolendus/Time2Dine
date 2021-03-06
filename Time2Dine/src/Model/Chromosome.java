import java.util.ArrayList;
import java.util.Random;

public class Chromosome implements Comparable<Chromosome> {
    private ArrayList<Furniture> furList;
    private ArrayList<Boolean> chromosomeArray;

    private int cost;
    private double evaluationPoints;
    boolean canteenMap[][]; // free place = false, occupied place = true

    public Chromosome() {
        ;
    }

    public Chromosome(Canteen canteen) {
        this.furList = new ArrayList<>();
        this.chromosomeArray = new ArrayList<>();
        this.cost = 0;
        initCanteenMap(canteen);
        fillChromosome(canteen);
    }

    // ----------------------------- Main algorithm making chromosome -----------------------------
    public void fillChromosome(Canteen canteen) {

        ArrayList<Furniture> furnitureList = new ArrayList<>();
        ArrayList<Furniture> furnitureModel = new ArrayList<>();
        fillFurnitureModel(furnitureModel);

        Random random = new Random();

        while (cost < canteen.getBudget()) {
            int wrongCounter = 0;

            while(wrongCounter < 100 && cost < canteen.getBudget()) {
                int x = random.nextInt(canteen.getMaxPixelX());
                int y = canteen.getMinPixelY(x)+ random.nextInt(canteen.getMaxPixelY()-canteen.getMinPixelY(x));
                FurnitureEnum randomFE = furnitureModel.get(random.nextInt(furnitureModel.size())).getKey();
                if(checkPosition(x, y, randomFE ,canteen) ) {
                    wrongCounter = 0;
                    Furniture f = new Furniture(randomFE,x,y);
                    addFurniture(f);
                    updatePosition(f.getX1Position(), f.getY1Position(), f.getKey());
                    cost += canteen.getCost(f.getKey());
                } else wrongCounter++;
            }

            if(cost >= canteen.getBudget()) break;

            furnitureList.clear();
            for (int y = 0; y < canteen.getMaxPixelY(); y++) {
                for (int x = 0; x < canteen.getMaxPixelX(y); x++) {
                    for (FurnitureEnum furnitureEnum : FurnitureEnum.values()) {
                        if (checkPosition(x, y, furnitureEnum,canteen)) {
                            furnitureList.add(new Furniture(furnitureEnum, x, y));
                        }
                    }
                }
            }
            if (!furnitureList.isEmpty()) {
                wrongCounter = 0;
                while(wrongCounter < 100 && cost < canteen.getBudget() ) {
                    Furniture furniture = furnitureList.get(random.nextInt(furnitureList.size()));
                    if(checkPosition(furniture.getX1Position(), furniture.getY1Position(), furniture.getKey(),canteen)) {
                        wrongCounter = 0;
                        addFurniture(furniture);
                        updatePosition(furniture.getX1Position(), furniture.getY1Position(), furniture.getKey());
                        cost += canteen.getCost(furniture.getKey());
                    } else wrongCounter++;
                } break;
            } else break; // No place for any furniture
        }

        furnituresToBytes(canteen);
    }

    private void fillFurnitureModel(ArrayList<Furniture> furModel) {
        for (FurnitureEnum furnitureEnum : FurnitureEnum.values()) {
            furModel.add(new Furniture(furnitureEnum));
        }
    }

    // ----------------------------- Helping functions -----------------------------
    private boolean checkPosition(int x, int y, FurnitureEnum furnitureEnum,Canteen canteen) {
        // <------------------------------- TODO -------------------------------------------------->
        // Case for every furniture
        // condtion when furniture pos is out of canteen
        for (int xPos = x; xPos < x + furnitureEnum.getWidth(furnitureEnum); xPos++) {
            for (int yPos = y; yPos < y + furnitureEnum.getHeight(furnitureEnum); yPos++) {
                if (canteen.getMaxPixelX(yPos) <= xPos || canteen.getMinPixelY(xPos) >= yPos || yPos >= canteenMap.length || canteenMap[xPos][yPos])
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

    private boolean checkIfTablesAreNearby(int x, int y, boolean[][] canteenMap, FurnitureEnum furnitureEnum,Canteen canteen) {
        boolean canFitTheTable = false;
        //wspolrzedne lewego górnego rogu sprawdzanego kwadratu
        int searchStartX = x - 62;
        int searchStartY = y - 62;
        //wspolrzedne prawego dolnego rogu sprawdzanego kwadratu
        int p = x + furnitureEnum.getWidth(furnitureEnum) + 62;
        int d = y + furnitureEnum.getHeight(furnitureEnum) + 62;
        //górna i dolna linia "kwadratu". Dodaje 62 bo zakladam ze 1 piksel odstepu od stolu dla krzesel, czyli stoly od siebie 21pikseli x2 plus przejscie 20 pikseli
        for (int j = searchStartX; j < p; j++) {
            if ( ( j < 0  || j > canteen.getMaxPixelX(searchStartY)) || (searchStartY < 0) ) {
                continue;//nic nie robimy, jestesmy poza stołówką
            }   /*lewy górny punkt startu*/                 /*lewy dolny punkt startu*/
            if ((canteenMap[j][searchStartY] == true) || (canteenMap[j][d] == true)) {
                return false;//sprawdzamy górną linię i dolną
            }
        }
        //boczne kwadratu
        for (int j = searchStartY; j < d; j++) {
            if ( (j < 0 || j > canteen.getMaxPixelY(/*searchStartX*/) ) || (searchStartX < 0)) {
                continue ;//nic nie robimy, jestesmy poza stołówką
            }
            if ((canteenMap[searchStartX][j] == true) || (canteenMap[p][j] == true) ) {
                return false;//sprawdzamy lewą linię
            }
        }
        return true;
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

    public ArrayList<Furniture> getFurList() {
        return furList;
    }

    public void initCanteenMap(Canteen canteen) {
        canteenMap = new boolean[canteen.getMaxPixelX()][canteen.getMaxPixelY()];
        for(int i = 0; i < canteen.getMaxPixelX(); i++) {
            for(int j = 0; j < canteen.getMaxPixelY(); j++){
                canteenMap[i][j] = false;
            }
        }
    }

    public double getEvaluationPoints() {
        return evaluationPoints;
    }

    @Override
    public int compareTo(Chromosome compareChromosome){
        if(this.evaluationPoints<compareChromosome.evaluationPoints)
            return 1;
        else if(compareChromosome.evaluationPoints<this.evaluationPoints)
            return -1;
        return 0;
    }
}

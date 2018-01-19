import java.util.ArrayList;

public class Controller {

   private Model theModel;
   private Canteen canteen;
   private ArrayList<Chromosome> chromosomes;

   public Controller() {
        theModel = new Model();
        chromosomes = new ArrayList<>();
    }

    public void createCanteen(double bWall, double tWall, double rWall, double lWall, int budget){
       canteen = theModel.createCanteen(bWall, tWall, rWall, lWall, budget);
       if(canteen==null){
           /*ERROR MESSAGE*/
       }
    }
    public void setFurnitureCosts(FurnitureEnum furnitureEnum, double cost){
        canteen.setCost(furnitureEnum,cost);
    }
    public void createPopulation(){
       chromosomes = theModel.createPopulation(this.canteen);
    }

    public void setCanteenCosts(FurnitureEnum key,int cost){
        this.canteen.setCost(key,cost);
    }
    public void setAlgorithmSettings(String key, double setting){this.canteen.setAlgorithmSettings(key,setting);}
    public Canteen getCanteen() {
        return canteen;
    }

    public Chromosome getBestChromosome() {
        System.out.println(chromosomes.get(0).getEvaluationPoints());
        return chromosomes.get(0);
    }

    public void nextGeneration() {
       chromosomes = theModel.nextGeneration(canteen,chromosomes,canteen.getAlgorithmSetting("mutationRatio"), canteen.getAlgorithmSetting("crossRatio"));
    }

    public double getIterNumber() {
        return canteen.getAlgorithmSetting("genQuan");
    }

    public double getDelay() {
        return canteen.getAlgorithmSetting("iterSpeed");
    }
}

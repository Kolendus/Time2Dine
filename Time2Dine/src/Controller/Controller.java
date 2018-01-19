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
    public void createPopulation(){
       chromosomes = theModel.createPopulation(this.canteen);
    }

    public void setCanteenCosts(FurnitureEnum key,int cost){
        this.canteen.setCost(key,cost);
    }

    public Canteen getCanteen() {
        return canteen;
    }

    public Chromosome getBestChromosome() {
        return chromosomes.get(0);
    }
}

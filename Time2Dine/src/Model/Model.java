import java.util.ArrayList;

public class Model {
    private Canteen canteen;
    private Algorithm algorithm;
    private ArrayList<Chromosome> chromosomes;
    private Chromosome chromosome;
    private Evaluate evaluate;

    public Model() {
        this.canteen = new Canteen();
        this.algorithm = new Algorithm();
        this.evaluate = new Evaluate();
    }

    public boolean createCanteen(double bWall, double tWall, double rWall, double lWall){
        //In case parameters are wrong
        if(!canteen.setWalls(bWall,tWall,rWall,lWall)){
            return false;
        }
        return true;
    }

    public void setCanteenCosts(String key,int cost){
        canteen.setCost(key,cost);
    }
     public void createPopulation() {
         for (int i = 0; i < 50; i++) {
             chromosome = algorithm.generateChromosomes(canteen);
             chromosomes.add(chromosome);
             evaluate.evaluate(chromosome);
         }
     }

    public ArrayList<Chromosome> getChromosomes() {
        return chromosomes;
    }

    public Canteen getCanteen() {
        return canteen;
    }
}

import java.util.ArrayList;

public class Model {

    private Algorithm algorithm;
    private Evaluate evaluate;

    public Model() {
        this.algorithm = new Algorithm();
        this.evaluate = new Evaluate();
    }

    public Canteen createCanteen(double bWall, double tWall, double rWall, double lWall){
        Canteen canteen = new Canteen();
        //In case parameters are wrong
        if(!canteen.setWalls(bWall,tWall,rWall,lWall)){
            return null;
        }
        return canteen;
    }


     public ArrayList<Chromosome> createPopulation(Canteen canteen) {
         ArrayList<Chromosome> chromosomes = new ArrayList<>();
         Chromosome chromosome;
         for (int i = 0; i < 50; i++) {
             chromosome = algorithm.generateChromosomes(canteen);
             chromosomes.add(chromosome);
             evaluate.evaluate(chromosome);
         }
         return chromosomes;
     }


}

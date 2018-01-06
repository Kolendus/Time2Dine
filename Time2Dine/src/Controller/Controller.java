import java.util.ArrayList;

public class Controller {

   private Model theModel;
   private Canteen canteen;
   private ArrayList<Chromosome> chromosomes;
   public Controller(Algorithm algorithm, Canteen canteen, Chromosome chromosome) {
        theModel = new Model();
    }

    public ArrayList<Chromosome> generateChromosome() {
        return theModel.createPopulation(this.canteen);
    }
    public void createCanteen(double bWall, double tWall, double rWall, double lWall){
       canteen = theModel.createCanteen(bWall, tWall, rWall, lWall);
       if(canteen==null){
           /*ERROR MESSAGE*/
       }

    }
    public void createPopulation(){
       chromosomes = theModel.createPopulation(this.canteen);
    }
    public void setCanteenCosts(String key,int cost){
        this.canteen.setCost(key,cost);
    }


    /*
    public void crossBreed(){
        algorithm.crossBreed(chromosomes);
    }
    public void mutate(){
        algorithm.mutate(chromosomes); //Maybe we should change Chromosome [] chromosomes
        into an actual ArrayList? i guess it will be easier and more efficient
        in the long run
    }
    */

}

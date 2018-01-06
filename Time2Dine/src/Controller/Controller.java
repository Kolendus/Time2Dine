import java.util.ArrayList;

public class Controller {

   private Model theModel;

    public Controller(Algorithm algorithm, Canteen canteen, Chromosome chromosome) {
        theModel = new Model();
    }

    public ArrayList<Chromosome> generateChromosome() {
        theModel.createPopulation();
        return theModel.getChromosomes();
    }
    public Canteen getCanteen(double bWall, double tWall, double rWall, double lWall){
        theModel.createCanteen(bWall, tWall, rWall, lWall);
        return theModel.getCanteen();
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

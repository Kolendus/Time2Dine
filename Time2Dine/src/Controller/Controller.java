import java.util.ArrayList;

public class Controller {

    private Algorithm algorithm;
    private Canteen canteen;
    private ArrayList chromosomes;

    public Controller(Algorithm algorithm, Canteen canteen, Chromosome chromosome) {
        this.algorithm = algorithm;
        this.canteen = canteen;
        this.chromosomes = new ArrayList<Chromosome>();
    }

    public void generateChromosome() {
        chromosomes.add(algorithm.generateChromosomes(canteen));
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

    public void clearArrayList(){
        this.chromosomes = new ArrayList<Chromosome>();
    }
}

import java.util.ArrayList;

public class Model {

    private Algorithm algorithm;

    public Model() {
        this.algorithm = new Algorithm();
    }

    public Canteen createCanteen(double bWall, double tWall, double rWall, double lWall, int budget) {
        Canteen canteen = new Canteen(budget);
        //In case parameters are wrong
        if (!canteen.setWalls(bWall, tWall, rWall, lWall)) {
            return null;
        }
        return canteen;
    }

    public ArrayList<Chromosome> createPopulation(Canteen canteen) {
        return algorithm.generateChromosomes(canteen, 100);
    }

    public ArrayList<Chromosome> nextGeneration(Canteen canteen, ArrayList<Chromosome> chromosomes, double mutationRatio, double crossRatio) {
        return algorithm.createNextGeneration(canteen,chromosomes,mutationRatio,crossRatio);
    }

    public void crossBreed(ArrayList<Chromosome> chromosomes) {
        algorithm.crossBreed(chromosomes);
    }

    public void mutate(ArrayList<Chromosome> chromosomes) {
        algorithm.mutate(chromosomes);
    }

}

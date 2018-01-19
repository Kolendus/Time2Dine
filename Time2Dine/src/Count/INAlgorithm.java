import java.util.ArrayList;

public interface INAlgorithm {
    void mutate(ArrayList<Chromosome> chromosomes);
    Chromosome crossBreed(ArrayList<Chromosome> chromosomes);
    ArrayList<Chromosome> generateChromosomes(Canteen canteen, int numberOfChromosomes);
}

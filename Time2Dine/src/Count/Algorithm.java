import java.util.ArrayList;
import java.util.Collections;

public class Algorithm implements INAlgorithm {

    private Evaluate evaluate;

    public Algorithm() {
        evaluate = new Evaluate();
    }

    public void mutate(ArrayList<Chromosome> chromosomes) {

    }

    public void crossBreed(ArrayList<Chromosome> chromosomes) {

    }

    public ArrayList<Chromosome> generateChromosomes(Canteen canteen, int numberOfChromosomes) {
        ArrayList<Chromosome> chromosomes = new ArrayList<>();
        for(int i = 0; i < numberOfChromosomes; i++) {
            Chromosome chromosome = new Chromosome(canteen);
            evaluate.evaluate(chromosome);
            chromosomes.add(chromosome);
        }

        Collections.sort(chromosomes);

        return chromosomes;
    }

}

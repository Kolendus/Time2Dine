import java.util.ArrayList;

public class Algorithm implements INAlgorithm {

    private ArrayList<Furniture> furList;
    public void mutate(ArrayList<Chromosome> chromosomes) {

    }

    public void crossBreed(ArrayList<Chromosome> chromosomes) {

    }

    public Chromosome generateChromosomes(Canteen canteen) {
        Chromosome chromosome = new Chromosome();
        this.furList = new ArrayList<>();

        addFurnitureToChromosome(chromosome,furList);
        return null;
    }


    private void addFurnitureToChromosome(Chromosome chromosome, ArrayList<Furniture> fur){
        for(int i = 0; i < fur.size(); i++){
            chromosome.addFurniture(fur.get(i));
        }
    }
}

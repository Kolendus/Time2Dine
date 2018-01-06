import java.util.ArrayList;

public class Chromosome {
    ArrayList<Furniture> furList;
    boolean[] chromosomeArray;
    private double evaluationPoints;

    public Chromosome() {
        this.furList = new ArrayList<>();
    }

    public void addFurniture(Furniture mebel) {
        furList.add(mebel);
    }

    public boolean[] createCromosomeArray() {
        return null;
    }

}

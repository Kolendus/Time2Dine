import java.util.ArrayList;

public class Chromosome {
    ArrayList<Furniture> furList;
    boolean [] chromosomeArray;

    public Chromosome(ArrayList<Furniture> furList, boolean[] chromosomeArray) {
        this.furList = furList;
        this.chromosomeArray = chromosomeArray;
    }

    public void addFurniture(Furniture mebel){
        furList.add(mebel);
    }
}

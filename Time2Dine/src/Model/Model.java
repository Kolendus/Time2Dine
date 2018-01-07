import java.util.ArrayList;

public class Model {

    private Algorithm algorithm;

    public Model() {
        this.algorithm = new Algorithm();
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
         return algorithm.generateChromosomes(canteen,100);
     }


}

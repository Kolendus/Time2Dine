import java.util.ArrayList;

public class Controller {

   private Model theModel;
   private Canteen canteen;
   private ArrayList<Chromosome> chromosomes;

   public Controller() {
        theModel = new Model();
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





}

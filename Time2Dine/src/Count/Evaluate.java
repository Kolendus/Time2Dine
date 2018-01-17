import java.util.ArrayList;

public class Evaluate implements INEvaluate {

    public void evaluate(Chromosome chromosome) {
        double points = 0;
        ArrayList<Furniture> furList = chromosome.getFurList();
        for(Furniture f : furList) {
            if(f.getKey().name().equals("LOWILUM"))
                points += 1.0;
            if(f.getKey().name().equals("MEDILUM"))
                points += 1.0;
            if(f.getKey().name().equals("STRONGILUM"))
                points += 1.0;
        }
        chromosome.setEvaluationPoints(points);
    }
}

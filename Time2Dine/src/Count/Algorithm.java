import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Algorithm implements INAlgorithm {

    private Evaluate evaluate;

    public Algorithm() {
        evaluate = new Evaluate();
    }

    public void mutate(ArrayList<Chromosome> chromosomes) {
        Random r = new Random();
        Chromosome ch = chromosomes.get(r.nextInt(chromosomes.size()));
        for (int i = 0; i < r.nextInt(3) + 1; i++) {
            switch (r.nextInt(13)) {
                case 0:
                    mutateEnum(FurnitureEnum.SMALLBENCH, FurnitureEnum.BIGBENCH, ch);
                    break;
                case 1:
                    mutateEnum(FurnitureEnum.BIGBENCH, FurnitureEnum.SMALLBENCH, ch);
                    break;
                case 2:
                    mutateEnum(FurnitureEnum.FOURPTABLE, FurnitureEnum.SIXPTABLE, ch);
                    break;
                case 3:
                    mutateEnum(FurnitureEnum.FOURPTABLE, FurnitureEnum.EIGHTPTABLE, ch);
                case 4:
                    mutateEnum(FurnitureEnum.SIXPTABLE, FurnitureEnum.EIGHTPTABLE, ch);
                    break;
                case 5:
                    mutateEnum(FurnitureEnum.SIXPTABLE, FurnitureEnum.FOURPTABLE, ch);
                    break;
                case 6:
                    mutateEnum(FurnitureEnum.EIGHTPTABLE, FurnitureEnum.SIXPTABLE, ch);
                    break;
                case 7:
                    mutateEnum(FurnitureEnum.EIGHTPTABLE, FurnitureEnum.FOURPTABLE, ch);
                    break;
                case 8:
                    mutateEnum(FurnitureEnum.LOWILUM, FurnitureEnum.MEDILUM, ch);
                    break;
                case 9:
                    mutateEnum(FurnitureEnum.LOWILUM, FurnitureEnum.STRONGILUM, ch);
                    break;
                case 10:
                    mutateEnum(FurnitureEnum.MEDILUM, FurnitureEnum.STRONGILUM, ch);
                    break;
                case 11:
                    mutateEnum(FurnitureEnum.MEDILUM, FurnitureEnum.LOWILUM, ch);
                    break;
                case 12:
                    mutateEnum(FurnitureEnum.STRONGILUM, FurnitureEnum.MEDILUM, ch);
                    break;
                case 13:
                    mutateEnum(FurnitureEnum.STRONGILUM, FurnitureEnum.LOWILUM, ch);
                    break;
            }
        }
    }

    public void crossBreed(ArrayList<Chromosome> chromosomes) {

    }

    private void mutateEnum(FurnitureEnum before, FurnitureEnum after, Chromosome chromosome) {
        for (int i = 0; i < chromosome.getFurList().size(); i++) {
            if (chromosome.getFurList().get(i).getKey() == before) {
                chromosome.getFurList().get(i).setKey(after);
            }
        }
    }

    public ArrayList<Chromosome> generateChromosomes(Canteen canteen, int numberOfChromosomes) {
        ArrayList<Chromosome> chromosomes = new ArrayList<>();
        for (int i = 0; i < numberOfChromosomes; i++) {
            Chromosome chromosome = new Chromosome(canteen);
            evaluate.evaluate(chromosome);
            chromosomes.add(chromosome);
        }

        Collections.sort(chromosomes);

        return chromosomes;
    }

}

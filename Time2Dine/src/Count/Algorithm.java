import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Algorithm implements INAlgorithm {

    private Evaluate evaluate;
    private Random r = new Random();

    public Algorithm() {
        evaluate = new Evaluate();
    }

    public void mutate(ArrayList<Chromosome> chromosomes) {
        Random r = new Random();
        Chromosome ch = chromosomes.get(r.nextInt(chromosomes.size()));
        /*50% na mutacje stołów, 33# na mutacje ław, 17% szans na mutacje świateł*/
        for (int i = 0; i < r.nextInt(3) + 1; i++) {
            switch (r.nextInt(5)) {
                case 0:
                    mutateTables(ch);
                    break;
                case 1:
                    mutateTables(ch);
                    break;
                case 2:
                    mutateTables(ch);
                    break;
                case 3:
                    mutateBenches(ch);
                case 4:
                    mutateBenches(ch);
                case 5:
                    mutateIlum(ch);
            }
        }
    }

    public ArrayList<Chromosome> createNextGeneration(Canteen canteen, ArrayList<Chromosome> chromosomes, double mutationRatio, double crossRatio) {
        int finalSize = chromosomes.size();
        int mutationNumber = (int) ( mutationRatio*(double) chromosomes.size() );
        int crossNumber = (int) ( crossRatio*(double) chromosomes.size() );

        linearRanking(chromosomes);
        for(int i=0;i<crossNumber;i++) {
            crossBreedv2(chromosomes);
        }
        for(int i=0;i<mutationNumber;i++) {
           // mutate(chromosomes);
        }

        while(chromosomes.size() < finalSize) {
            Chromosome chromosome = new Chromosome(canteen);
            evaluate.evaluate(chromosome);
            chromosomes.add(chromosome);
        }

        linearRanking(chromosomes);
        return chromosomes;
    }

    public Chromosome crossBreed(ArrayList<Chromosome> chromosomes) {
        Random r = new Random();
        int bound = Math.round(r.nextInt(chromosomes.size() / 2)) + 1;
        int index1 = r.nextInt(bound);
        return crossChromosomes(chromosomes.get(index1), chromosomes.get(index1 - 1));
    }

    public void crossBreedv2(ArrayList<Chromosome> chromosomes) {
        /*Random r = new Random();
        chromosomes.remove(r.nextInt((chromosomes.size())));*/
        chromosomes.remove(chromosomes.size()- 1);
    }

    private void linearRanking(ArrayList<Chromosome> chromosomes) {
        Collections.sort(chromosomes);
    }

    private Chromosome crossChromosomes(Chromosome first, Chromosome second) {
        Chromosome secondCopy = second;
        int length = first.getFurList().size() > secondCopy.getFurList().size() ? secondCopy.getFurList().size() : first.getFurList().size();

        for (int i = 0; i < length; i++) {
            int toRemove = r.nextInt(first.getFurList().size());
            Furniture furnitureFirst = first.getFurList().get(toRemove);
            for (int j = 0; j < 100; j++) {
                int index = r.nextInt(secondCopy.getFurList().size());
                Furniture furnitureSecond = secondCopy.getFurList().get(index);
                if (furnitureSecond.getKey() == furnitureFirst.getKey()) {
                    newFurniturePosition(furnitureFirst, furnitureSecond,first );
                    secondCopy.getFurList().remove(index);
                    first.getFurList().remove(toRemove);
                    break;
                }
            }
        }
        return first;
    }

    private void newFurniturePosition(Furniture first, Furniture second, Chromosome crossedChromo) {
        Furniture newFur = new Furniture(first.getKey(), (first.getX1Position() + second.getX1Position()) / 2, (first.getY1Position() + second.getY1Position()) / 2);
        crossedChromo.addFurniture(newFur);
    }


    private void mutateTables(Chromosome ch) {
        Random r = new Random();
        switch (r.nextInt(5)) {
            case 0:
                mutateEnum(FurnitureEnum.FOURPTABLE, FurnitureEnum.SIXPTABLE, ch);
                break;
            case 1:
                mutateEnum(FurnitureEnum.FOURPTABLE, FurnitureEnum.EIGHTPTABLE, ch);
            case 2:
                mutateEnum(FurnitureEnum.SIXPTABLE, FurnitureEnum.EIGHTPTABLE, ch);
                break;
            case 3:
                mutateEnum(FurnitureEnum.SIXPTABLE, FurnitureEnum.FOURPTABLE, ch);
                break;
            case 4:
                mutateEnum(FurnitureEnum.EIGHTPTABLE, FurnitureEnum.SIXPTABLE, ch);
                break;
            case 5:
                mutateEnum(FurnitureEnum.EIGHTPTABLE, FurnitureEnum.FOURPTABLE, ch);
                break;
        }

    }

    private void mutateBenches(Chromosome ch) {
        Random r = new Random();
        switch (r.nextInt(1)) {
            case 0:
                mutateEnum(FurnitureEnum.BIGBENCH, FurnitureEnum.SMALLBENCH, ch);
                break;
            case 1:
                mutateEnum(FurnitureEnum.BIGBENCH, FurnitureEnum.SMALLBENCH, ch);
                break;
        }
    }

    private void mutateIlum(Chromosome ch) {
        Random r = new Random();
        switch (r.nextInt(5)) {
            case 0:
                mutateEnum(FurnitureEnum.LOWILUM, FurnitureEnum.STRONGILUM, ch);
                break;
            case 1:
                mutateEnum(FurnitureEnum.LOWILUM, FurnitureEnum.MEDILUM, ch);
                break;
            case 2:
                mutateEnum(FurnitureEnum.MEDILUM, FurnitureEnum.STRONGILUM, ch);
                break;
            case 3:
                mutateEnum(FurnitureEnum.MEDILUM, FurnitureEnum.LOWILUM, ch);
                break;
            case 4:
                mutateEnum(FurnitureEnum.STRONGILUM, FurnitureEnum.MEDILUM, ch);
                break;
            case 5:
                mutateEnum(FurnitureEnum.STRONGILUM, FurnitureEnum.LOWILUM, ch);
                break;
        }
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

        linearRanking(chromosomes);

        return chromosomes;
    }

}

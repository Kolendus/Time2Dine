import java.util.ArrayList;

public class Evaluate implements INEvaluate {

    private double points;

    public void evaluate(Chromosome chromosome) {
        this.points = 0;
        ArrayList<Furniture> furList = chromosome.getFurList();
        for (Furniture f : furList) {
            if (f.getKey().name().equals("LOWILUM"))
                points += 1.0;
            if (f.getKey().name().equals("MEDILUM"))
                points += 2.0;
            if (f.getKey().name().equals("STRONGILUM"))
                points += 3.0;
        }
        countFurnitures(furList);
        chromosome.setEvaluationPoints(points);
    }

    private void countFurnitures(ArrayList<Furniture> furList) {
        int chair = 0, p4tab = 0, p6tab = 0, p8tab = 0;
        for (Furniture f : furList) {
            if (f.getKey().name().equals("FOURPTABLE")) {
                p4tab++;
            }
            if (f.getKey().name().equals("SIXPTABLE")) {
                p6tab++;
            }
            if (f.getKey().name().equals("EIGHTPTABLE")) {
                p8tab++;
            }
            if (f.getKey().name().equals("SMALLCHAIR")) {
                chair++;
            }
        }
        countPoints(chair,p4tab,p6tab,p8tab);
    }

    private void countPoints(int chair, int p4tab, int p6tab, int p8tab) {
        if (5 <= chair || chair <= 10) {
            this.points += 3.5;
        } else if (11 <= chair || chair <= 16) {
            this.points += 4.5;
        } else if (17 <= chair || chair <= 22) {
            this.points += 5.0;
        } else if (23 <= chair || chair <= 27) {
            this.points += 5.5;
        } else if (28 <= chair || chair <= 32) {
            this.points += 6.5;
        } else if (33 <= chair || chair <= 38) {
            this.points += 7.0;
        } else if (39 <= chair || chair <= 44) {
            this.points += 7.5;
        } else if (45 <= chair || chair <= 50) {
            this.points += 7.0;
        } else if (chair > 50) {
            this.points += 5.0;
        }
        if (1 <= p4tab || p4tab <= 3) {
            this.points += 3.0;
        } else if (4 <= p4tab || p4tab <= 6) {
            this.points += 4.0;
        } else if (7 <= p4tab || p4tab <= 9) {
            this.points += 2.5;
        } else if (10 <= p4tab || p4tab <= 12) {
            this.points += 1.5;
        } else if (p4tab > 12) {
            this.points += 1.5;
        }

        if (1 <= p6tab || p6tab <= 3) {
            this.points += 3.5;
        } else if (4 <= p6tab || p6tab <= 6) {
            this.points += 4.5;
        } else if (7 <= p6tab || p6tab <= 9) {
            this.points += 4.0;
        } else if (10 <= p6tab || p6tab <= 12) {
            this.points += 2.5;
        } else if (p6tab > 12) {
            this.points += 1.0;
        }

        if (1 <= p8tab || p8tab <= 3) {
            this.points += 5.0;
        } else if (4 <= p8tab || p8tab <= 6) {
            this.points += 7.0;
        } else if (7 <= p8tab || p8tab <= 9) {
            this.points += 3.5;
        } else if (10 <= p8tab || p8tab <= 12) {
            this.points += 1.5;
        } else if (p8tab > 12) {
            this.points += 0.5;
        }


    }
    /*
     * Krzesła
5-10  - 3.5
11-16  - 4.5
17-22  - 5.0
22- 27 – 5.5
27- 32 – 6.5
32-37 – 7.0
42 -47 – 7.5
47-52 – 7.0
53-58 – 6.5
58+  - 5.0
Stoły 4 osobowe:
1-3 – 3.0
4-6 – 4.0
7-9 – 2.5
10-12 – 1.5
12+ - 0.5
Stoły 6 osobowe:
1-3 – 3.5
4-6 – 4.5
7-9 – 4.0
10-12 – 2.5
12+ - 1.0
Stoły 8 osobowe:
1-3 – 5.0
4-6 – 7.0
7-9 – 3.5
10-12 – 1.5
12+ - 0.5

    * */
}

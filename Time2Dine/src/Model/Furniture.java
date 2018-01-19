public class Furniture {

    private FurnitureEnum key;
    private int x1Position;
    private int y1Position;

    public Furniture(FurnitureEnum key, int x1Position, int y1Position) {
        this.key = key;
        this.x1Position = x1Position;
        this.y1Position = y1Position;
    }
    public Furniture(FurnitureEnum key) {
        this.key = key;
    }

    public int getX1Position() {
        return x1Position;
    }

    public int getY1Position() {
        return y1Position;
    }

    public void setKey(FurnitureEnum key) {
        this.key = key;
    }

    public FurnitureEnum getKey() {
        return key;
    }
}

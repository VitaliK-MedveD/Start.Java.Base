package shipsAndCones.containers;

public class Cone extends Container{

    int height = setRandomHeight();
    int diagonal = setRandomOneOfTwo(BIG, SMALL);
    int din = diagonal / 10;
    int density = setRandomOneOfTwo(HI_DENSITY, LOW_DENSITY);
    private String type;

    @Override
    public int getBaseArea(int a) {
        return (int) ((Math.PI * a * a) / 4);
    }

    @Override
    public int getWeight() {
        return ((getBaseArea(diagonal) * height) / 3) * density;
    }

    @Override
    public int getDin() {
        return din;
    }

    @Override
    public String getType() {
        if (din == 1) {
            type = "Малый конус";
        } else {
            type = "Большой конус";
        }
        return type;
    }
}

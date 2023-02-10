package shipsAndCones.containers;

public class Cylinder extends Container{

    private int height = setRandomHeight();
    private int diagonal = setRandomOneOfTwo(BIG, SMALL);
    private int din = diagonal / 10;
    private int density = setRandomOneOfTwo(HI_DENSITY, LOW_DENSITY);
    private String type;

    @Override
    public int getBaseArea(int a) {
        return (int) ((Math.PI * a * a) / 4);
    }

    @Override
    public int getWeight() {
        return getBaseArea(diagonal) * height * density;
    }

    @Override
    public int getDin() {
        return din;
    }

    public int getDiagonal() {
        return diagonal;
    }

    @Override
    public String getType() {
        if (din == 1) {
            type = LITTLE + CYLINDER;
        } else {
            type = LARGE + CYLINDER;
        }
        return type;
    }
}

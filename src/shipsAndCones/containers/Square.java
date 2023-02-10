package shipsAndCones.containers;

public class Square extends Container{

    private int height = setRandomHeight();
    private int diagonal = setRandomOneOfTwo(BIG, SMALL);
    private int din = diagonal / 10;
    private int density = setRandomOneOfTwo(HI_DENSITY, LOW_DENSITY);
    private String type;

    @Override
    public int getBaseArea(int diag) {
        return ((diag * diag) / 2);
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
            type = LITTLE + SQUARE;
        } else {
            type = LARGE + SQUARE;
        }
        return type;
    }
}

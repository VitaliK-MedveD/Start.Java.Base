package shipsAndCones.containers;

public class Square extends Container{

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

    @Override
    public String getType() {
        if (din == 1) {
            type = "Малый квадрат";
        } else {
            type = "Большой квадрат";
        }
        return type;
    }
}

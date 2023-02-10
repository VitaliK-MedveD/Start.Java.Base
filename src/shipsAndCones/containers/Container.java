package shipsAndCones.containers;

import shipsAndCones.shipyard.Menu;

import java.util.Random;

public abstract class Container {

    public static final int HI_DENSITY = 2000;
    public static final int LOW_DENSITY = 1000;
    public static final int BIG = 20;
    public static final int SMALL = 10;
    public static final String LARGE = "Большой ";
    public static final String LITTLE = "Малый ";
    public static final String SQUARE = "квадрат";
    public static final String CYLINDER = "Цилиндр";
    public static final String CONE = "Конус";
    public static final Random random = new Random();

    public abstract int getBaseArea(int a);

    public abstract int getWeight();

    public abstract int getDin();

    public abstract int getDiagonal();

    public abstract String getType();

    public static int setRandomOneOfTwo(int first, int second) {
        int n = random.nextInt(1, 3);
        if (n == 1) {
            return first;
        } else {
            return second;
        }
    }

    public int setRandomHeight() {
        return random.nextInt(10, 101);
    }

}


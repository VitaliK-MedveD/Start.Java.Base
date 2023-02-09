package shipsAndCones.containers;

import shipsAndCones.shipyard.Menu;

import java.util.Random;

public abstract class Container {

    public static final int HI_DENSITY = 2000;
    public static final int LOW_DENSITY = 1000;
    public static final int BIG = 20;
    public static final int SMALL = 10;
    public static final Random random = new Random();
    public int height = setRandomHeight();
    public int diagonal = setRandomOneOfTwo(BIG, SMALL);
    public int din = diagonal / 10;
    public int density = setRandomOneOfTwo(HI_DENSITY, LOW_DENSITY);

    public abstract int getBaseArea(int a);

    public abstract int getWeight();
    public abstract int getDin();
    public abstract String getType();

    public static int setRandomOneOfTwo(int a, int b) {
        int n = random.nextInt(1, 3);
        if (n == 1) {
            return a;
        } else {
            return b;
        }
    }

    public int setRandomHeight() {
        return random.nextInt(10, 101);
    }

}


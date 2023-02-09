package shipsAndCones.shipyard;

import shipsAndCones.ship.Ship;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shipyard {

    private static final String START_NAME = "Адмирал_";
    private static final String TOTAL_WEIGHT = "Общий вес грузов в порту: ";
    private static final int COUNT_OF_SHIPS = 10;

    public void arrivalShips() {
        int weight = 0;
        Ship[] ships = new Ship[COUNT_OF_SHIPS];
        for (int i = 0; i < COUNT_OF_SHIPS; i++) {
            Ship ship = new Ship(START_NAME + (i + 1));
            ship.loadTheShip();
            ships[i] = ship;
            weight += ship.getAllWeight();
        }
        System.out.println(Arrays.deepToString(ships));
        System.out.println(TOTAL_WEIGHT + weight);
    }
}

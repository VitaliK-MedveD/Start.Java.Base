package shipsAndCones.shipyard;

import shipsAndCones.containers.Container;
import shipsAndCones.containers.Square;
import shipsAndCones.ship.Deck;
import shipsAndCones.ship.Ship;

import java.util.Arrays;

public class Menu {

    public static void run() {
        Shipyard shipyard = new Shipyard();
        shipyard.arrivalShips();
    }
}

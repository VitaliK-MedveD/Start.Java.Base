package shipsAndCones.ship;

import shipsAndCones.containers.Container;

import java.util.Arrays;
import java.util.Random;

public class Ship {

    private String name;
    private Deck deck = new Deck();
    private int countOfDecks;
    private int countConteiners;
    private int allWeight;
    private String types;

    public void loadTheShip() {
        deck.loadTheDeck();
        countOfDecks = deck.getNumberOfDecks();
        countConteiners = deck.getCountConteiners();
        types = Arrays.toString(deck.getContainersType());
        allWeight = deck.getWeightDeck();
    }

    @Override
    public String toString() {
        return "Ship{" +
                "  Имя: " + name +
                "  Колличество палуб: " + countOfDecks +
                "  Колличество контейнеров: " + countConteiners +
                "  Типы контейнеров: " + types +
                "  Общий вес груза: " + allWeight +
                '}' + "\n";
    }

    public int getAllWeight() {
        return allWeight;
    }

    public Ship(String name) {
        this.name = name;
    }
}

package shipsAndCones.ship;

import shipsAndCones.containers.*;

import java.util.Arrays;
import java.util.Random;

public class Deck {

    private int numberOfDecks = Container.setRandomOneOfTwo(1, 2);
    private int numberOfDin = numberOfDecks * 4;
    private int countConteiners;
    private String[] containersType;
    private int weightDeck;

    public void loadTheDeck() {
        countConteiners = 0;
        Container[] containers = new Container[numberOfDin];
        for (int i = 0, din = 0; i < numberOfDin; i++) {
            RandomConteiner randomConteiner = new RandomConteiner();
            randomConteiner.make();
            din += randomConteiner.getDin();
            if (din < (numberOfDin + 1)) {
                containers[i] = randomConteiner;
                countConteiners = i + 1;
                if (din == numberOfDin) {
                    break;
                }
            } else {
                din -= randomConteiner.getDin();
                i--;
            }
        }
        containersType = new String[countConteiners];
        for (int i = 0; i < countConteiners; i++) {
            weightDeck += containers[i].getWeight();
            containersType[i] = containers[i].getType();
        }
    }

    public int getNumberOfDecks() {
        return numberOfDecks;
    }

    public int getCountConteiners() {
        return countConteiners;
    }

    public int getWeightDeck() {
        return weightDeck;
    }

    public String[] getContainersType() {
        return containersType;
    }
}

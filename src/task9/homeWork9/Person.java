package task9.homeWork9;

import task9.homeWork9.exceptions.NameEmptyException;
import task9.homeWork9.exceptions.NotEnoughAgeException;
import task9.homeWork9.exceptions.NotEnoughCashException;

public class Person {

    String name;
    int age;
    int cash;

    public void goDrinkBeer() throws RuntimeException {
        if (name.equals("")) {
            throw new NameEmptyException("\"" + name + "\"" +  " - невнятное имя!");
        } else if (age < 18) {
            throw new NotEnoughAgeException("\"" + name + "\"" +  " - еще малолетка!");
        } else if (cash < 20) {
            throw new NotEnoughCashException("\"" + name + "\"" + " - не хватает бабла!");
        } else {
            System.out.println("Ура! " + "\"" + name + "\"" + " идет бухать!");
        }
    }

    public Person(String name, int age, int cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return name;
    }
}

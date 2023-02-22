package task9;

import task9.exceptions.NameEmptyException;
import task9.exceptions.NotEnoughAgeException;
import task9.exceptions.NotEnoughCashException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("",21, 35));
        people.add(new Person("Стасик",17, 50));
        people.add(new Person("Валера",25, 10));
        people.add(new Person("Витя",30, 45));
        people.add(new Person("Инокентий",21, 16));
        people.add(new Person("Ксения",18, 20));
        drescod(people);
    }

    private static void drescod(List<Person> people) {
        List<Person> peopleInBar = new ArrayList<>(people);
        for (Person person : people) {
            try {
                person.goDrinkBeer();
            } catch (NameEmptyException | NotEnoughAgeException | NotEnoughCashException e) {
                System.out.println(e.getMessage());
                peopleInBar.remove(person);
            }
        }
        System.out.println('\n' + "В бар смогли пойти: " + peopleInBar);
    }
}

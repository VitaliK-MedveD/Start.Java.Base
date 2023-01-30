package Task4.cat;

import java.util.Random;

public class Begin {

    private static char randomChar() {
        Random randomSumbol = new Random();
        char sumbol = (char) (randomSumbol.nextInt(32) + 'а');
        return sumbol;
    }

    private static int randomLength() {
        Random l = new Random();
        int length = l.nextInt(3,7);
        return length;
    }

    private static String randomName() {
        char[] petName = new char[randomLength()];
        for (int i = 0; i < petName.length; i++) {
            petName[i] = randomChar();
        }
        String name = String.copyValueOf(petName);
        return name;
    }

    private static int randomAge() {
        Random num = new Random();
        int age = num.nextInt(28) + 1;
        return age;
    }

    public static void firstCycle() {
        int i = 0;
        while (i < 10) {
            Cat cat = new Cat();
            i++;
            System.out.println(cat);
        }
        System.out.println("Цикл \"While\" завершен!" + "\n");
    }

    public static void secondCycle() {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName(randomName());
            cat.setAge(randomAge());
            System.out.println("Имя: " + cat.getName() + "  Возраст: " + cat.getAge());
        }
        System.out.println("Цикл \"for\" завершен!" + "\n");
    }

    public static void thirdCycle () {
        int i = 0;
        do {
            Cat cat = new Cat(randomName(), randomAge());
            System.out.println(cat);
            i++;
        } while (i < 10);
        System.out.println("Цикл \"do...While\" завершен!" + "\n");
    }

    public static void fourthCycle(){

        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            Cat cat = new Cat(randomName(), randomAge());
            cats[i] = cat;
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("Цикл \"foreach\" завершен!");
    }

    public static void run() {
        Begin.firstCycle();
        Begin.secondCycle();
        Begin.thirdCycle();
        Begin.fourthCycle();
    }
}

package task9.guessNumber;

import task9.guessNumber.exceptions.IncorrectInput;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final Random random = new Random();
    private int randomNumber;
    private int input;
    private int size;

    public void play() {
        randomNumber = random.nextInt(1, size +1);
        do {
            try {
                inputNumber();
            } catch (IncorrectInput e) {
                System.out.println(e.getMessage());
                play();
            }
            if (randomNumber == input) {
                System.out.println("Угадали! Чистая победа!");
                input = 0;
            } else if (randomNumber > input && input != 0) {
                System.out.println("Не угадали! Число больше введенного значения!");
            } else if (input != 0) {
                System.out.println("Не угадали! Число меньше введенного значения!");
            }
        } while (input != 0);
    }

    private void inputNumber() throws RuntimeException {
        Scanner in = new Scanner(System.in);
        System.out.print("Угадайте число от 1 до " + size + ", или введите '0' для выхода - ");
        if (in.hasNextInt()) {
            input = in.nextInt();
            if (0 > input || input > size) {
                throw new IncorrectInput("Не коректное число!");
            }
        } else {
            throw new IncorrectInput("Вы ввели не числовое значение!");
        }
    }

    public Game(int size) {
        this.size = size;
    }
}

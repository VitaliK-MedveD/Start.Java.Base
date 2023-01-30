package Task3;

import java.util.Scanner;

public class Rainbow {

    public static final int RED = 1;
    public static final int ORANGE = 2;
    public static final int YELLOW = 3;
    public static final int GREEN = 4;
    public static final int BLUE = 5;
    public static final int INDIGO = 6;
    public static final int VIOLET = 7;
    public static final String REDDISH = "Красный";
    public static final String ORANGEISH = "Оранжевый";
    public static final String YELLOWISH = "Желтый";
    public static final String GREENISH = "Зеленый";
    public static final String BLUISH = "Голубой";
    public static final String IN = "Синий";
    public static final String PURPLE = "Фиолетовый";

    public static String replaseEnd (String word) {
        String resultWord = word.replace("ый", "о-");
        return resultWord;
    }

    public void run () {

        int number = 0;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите один или два номера цвета от 1 до 7, или введите '0' для выхода - ");
            number = in.nextInt();

            switch (number) {
                case RED, 11:
                    System.out.println(REDDISH);
                    break;
                case ORANGE, 22:
                    System.out.println(ORANGEISH);
                    break;
                case YELLOW, 33:
                    System.out.println(YELLOWISH);
                    break;
                case GREEN, 44:
                    System.out.println(GREENISH);
                    break;
                case BLUE, 55:
                    System.out.println(BLUISH);
                    break;
                case INDIGO, 66:
                    System.out.println(IN);
                    break;
                case VIOLET, 77:
                    System.out.println(PURPLE);
                    break;
                case 12, 21:
                    System.out.println(replaseEnd(REDDISH) + ORANGEISH);
                    break;
                case 13, 31:
                    System.out.println(replaseEnd(REDDISH) + YELLOWISH);
                    break;
                case 14, 41:
                    System.out.println(replaseEnd(REDDISH) + GREENISH);
                    break;
                case 15, 51:
                    System.out.println(replaseEnd(REDDISH) + BLUISH);
                    break;
                case 16, 61:
                    System.out.println(replaseEnd(REDDISH) + IN);
                    break;
                case 17, 71:
                    System.out.println(replaseEnd(REDDISH) + PURPLE);
                    break;
                case 23, 32:
                    System.out.println(replaseEnd(ORANGEISH) + YELLOWISH);
                    break;
                case 24, 42:
                    System.out.println(replaseEnd(ORANGEISH) + GREENISH);
                    break;
                case 25, 52:
                    System.out.println(replaseEnd(ORANGEISH) + BLUISH);
                    break;
                case 26, 62:
                    System.out.println(replaseEnd(ORANGEISH) + IN);
                    break;
                case 27, 72:
                    System.out.println(replaseEnd(ORANGEISH) + PURPLE);
                    break;
                case 34, 43:
                    System.out.println(replaseEnd(YELLOWISH) + GREENISH);
                    break;
                case 35, 53:
                    System.out.println(replaseEnd(YELLOWISH) + BLUISH);
                    break;
                case 36, 63:
                    System.out.println(replaseEnd(YELLOWISH) + IN);
                    break;
                case 37, 73:
                    System.out.println(replaseEnd(YELLOWISH) + PURPLE);
                    break;
                case 45, 54:
                    System.out.println(replaseEnd(GREENISH) + BLUISH);
                    break;
                case 46, 64:
                    System.out.println(replaseEnd(GREENISH) + IN);
                    break;
                case 47, 74:
                    System.out.println(replaseEnd(GREENISH) + PURPLE);
                    break;
                case 56, 65:
                    System.out.println(IN.replace("ий", "е-") + BLUISH);
                    break;
                case 57, 75:
                    System.out.println(replaseEnd(PURPLE) + BLUISH);
                    break;
                case 67, 76:
                    System.out.println(replaseEnd(PURPLE) + IN);
                    break;
                default:
                    if (number != 0) {
                        System.out.println("Введена неверная комбинация цветов!");
                    } else {
                        System.out.println("Выход из програмы!");
                    }
                    break;
            }
        } while (number != 0);
    }
}
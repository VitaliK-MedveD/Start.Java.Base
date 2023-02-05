package task5.matrix;

import java.util.Arrays;
import java.util.Random;

public class Assist {

    private static final Random random = new Random();

    /**
     * Выведение двумерного массива на экран.
     */
    public static void printDoubleArray(String[][] array) {
        System.out.println("\n" + "Первоначальная матрица:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Выведение массива целочисленных значений на экран.
     */
    public static void printIntArray(int[] array) {
        System.out.println("\n" + "Массив округленных значений:");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print("_" + array[i]);
            }
        }
        System.out.println();
    }

    /**
     * Генерирование рандомной буквы английского алфавита.
     */
    public static char randomChar() {
        return (char) (random.nextInt(26) + 'a');
    }

    /**
     * Генерирование рандомного слова длинною 7 символов.
     */
    public static String randomWord() {
        char[] word = new char[7];
        for (int i = 0; i < word.length; i++) {
            word[i] = randomChar();
        }
        return String.copyValueOf(word);
    }

    /**
     * Генерирование рандомного вещественного числа длинною 7 символов.
     */
    public static String randomNumber() {
        return String.valueOf(random.nextDouble(0, 10)).substring(0, 7);
    }

    /**
     * Объединение двух массивов.
     */
    public static String[] sumArrays(String[] a, String[] b) {
        String[] sum = new String[(a.length + b.length)];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i];
        }
        for (int i = 0, j = a.length; i < b.length; i++, j++) {
            sum[j] = b[i];
        }
        System.out.println(("Сумма диагоналей:" + "\n" + Arrays.toString(sum) + "\n"));
        return sum;
    }

    /**
     * Сравнение значений ячеек двух массивов.
     */
    public static void isArraysEquals (String[] a, String[] b) {
       boolean isequals = Arrays.equals(a, b);
       if (isequals) {
           System.out.println("Значение ячеек диагоналей совпадают!" + "\n");
       } else {
           System.out.println("Значение ячеек диагоналей НЕ совпадают!" + "\n");
       }
    }

    /**
     * Округление вещественного числа по заданному принципу.
     */
    public static int roundDoubleToInt (String s) {
        double input = Double.parseDouble(s);
        double result;
        if (((input * 10) % 10) >= 7) {
            result = Math.ceil(input);
        } else {
            result = Math.floor(input);
        }
        return (int) result;
    }
}

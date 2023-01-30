package Task4.sum2;

import java.util.Scanner;

/**
 * @author VitaliK.MedveD
 * Задача: Найдите сумму и произведение цифр числа, введенного с клавиатуры.
 * Применены только операторы цикла!
 */

public class Sum2 {

    public static int length(int n) {
        int i;
        for (i = 0; n != 0; i++) {
            n /= 10;
        }
        return i;
    }

    public void run () {

        int sum = 0;
        int mult = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        int tempNumber = number;
        int i;

        while ((i =length(number)) != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр = " + sum);

        while ((i = length(tempNumber)) != 0) {
            mult *= tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("Произведение цифр = " + mult);
    }
}

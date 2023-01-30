package Task4.sum;

import java.util.Scanner;

public class Sum {

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
        int[] num = new int[length(number)];

        for (int i = 0; number != 0; i++) {
            int a = (int) (number % 10);
            number /= 10;
            num[i] = a;
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Сумма цифр = " + sum);

        for (int i = 0; i < num.length; i++) {
            mult = mult * num[i];
        }
        System.out.println("Произведение цифр = " + mult);
    }
}

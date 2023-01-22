package DecToBin;
import java.util.Scanner;

public class decToBin {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int i = in.nextInt();
        int b;
        String bin = "";

        if (i < 0) {
            System.out.println("Вы ввели отрицательное значение, число будет взято по модулю");
            i = Math.abs(i);
        }

        while (i != 0) {
            b = i % 2;
            bin = b + bin;
            i = i / 2;
        } System.out.println("В двоичной системе счисления: " + bin);
        in.close();
    }
}

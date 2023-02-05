package task5.matrix;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {

    private static final String REGEX_WORD = "[a-z]";
    private static final String REGEX_NUMBER = "\\d?.?\\d+";
    private int a, b;
    private String[][] matrix;
    private String[] mainDiagonal;
    private String[] secondaryDiagonal;
    private String[] sumDiagonals;

    public void run() {
        matrix = createMatrix();
        mainDiagonal = getMainDiagonal(matrix);
        secondaryDiagonal = getSecondaryDiagonal(matrix);
        Assist.isArraysEquals(mainDiagonal, secondaryDiagonal);
        sumDiagonals = Assist.sumArrays(mainDiagonal, secondaryDiagonal);
        sortingDiagonals(sumDiagonals);
        Assist.printDoubleArray(matrix);
    }

    private String[][] createMatrix () {
        String[][] array = new String[a][b];
        for (int i = 0, sn = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++, sn++) {
                if ((sn % 3) == 0) {
                    array[i][j] = Assist.randomNumber();
                } else {
                    array[i][j] = Assist.randomWord();
                }
            }
        }
        return array;
    }

    private String[] getMainDiagonal (String[][] array) {
        String[] mainDiag = new String[10];
        for (int i = 0, j = 0; i < 10; i++, j++) {
            mainDiag[i] = array[i][j];
        }
        System.out.println("Главная диагональ: " + "\n" + Arrays.toString(mainDiag) + "\n");
        return mainDiag;
    }

    private String[] getSecondaryDiagonal (String[][] array) {
        String[] secondaryDiag = new String[10];
        for (int i = 0, j = 9; i < 10; i++, j--) {
            secondaryDiag[i] = array[i][j];
        }
        System.out.println("Побочная диагональ: " + "\n" + Arrays.toString(secondaryDiag) + "\n");
        return secondaryDiag;
    }

    /*
    Получение колличества числовых значение в массиве.
     */
    private int getCountOfNumbers (String[] str) {
        int j = 0;
        Pattern pattern = Pattern.compile(REGEX_NUMBER);
        for (int i = 0; i < str.length; i++) {
            Matcher matcher = pattern.matcher(str[i]);
            if (matcher.find()) {
                j++;
            }
        }
        return j;
    }

    private void sortingDiagonals (String[] array) {
        int[] roundIntArray = new int[getCountOfNumbers(array)];
        Pattern pattern = Pattern.compile(REGEX_WORD);
        System.out.println("StringBuilder");
        for (int i = 0, j = 0; i < array.length; i++) {
            Matcher matcher = pattern.matcher(array[i]);
            if (matcher.find()) {
                StringBuilder stringBuilder = new StringBuilder(array[i].substring(1, 4));
                System.out.print(stringBuilder + ", ");
            } else {
                roundIntArray[j] = Assist.roundDoubleToInt(array[i]);
                j++;
            }
        }
        System.out.println();
        Assist.printIntArray(roundIntArray);
    }

    public Matrix(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

package task11;

import task11.exceptions.WrongChoice;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public abstract class Consumer {

    public static final String MENU_ITEM = "Выберите пункт меню: ";
    public static final String DEL_POSITION_NUMBER = "Ведите номер позиции которую хотите удалить, " +
                            System.lineSeparator() + "или введите '0' для возврата в предыдущее меню: ";
    public static final String INCORRECT_VALUE = "Некорректное значение!";
    public static final String LIST_PRODUCTS = "Текущий список товаров:";
    public static final String LIST_ORDERS = "Текущий список заказов:";
    public static final String FILE_PRODUCTS = "proudctsList.txt";
    public static final String FILE_ORDERS = "ordersList.txt";
    public static final String LIST_IS_EMPTY = "Список пуст!";
    public static final String ITEM_NAME = "Введите название товара: ";
    public static final String PRODUCT_ADDED = "Товар добавлен!";
    public static final String ORDER_ADDED = "Заказ добавлен!";
    public static final String EXIT = "Выход из меню.";

    abstract void productsMenu();

    abstract void ordersMenu();

    protected int choiceNumber(String item, int limit) {
        int choice = 0;
        boolean isException;
        do {
            isException = false;
            try {
                System.out.print(item);
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (0 > choice || choice > limit) {
                        throw new WrongChoice(INCORRECT_VALUE);
                    }
                } else {
                    throw new WrongChoice(INCORRECT_VALUE);
                }
            } catch (WrongChoice e) {
                System.out.println(e.getMessage());
                isException = true;
            }
        } while (isException);
        return choice;
    }

    protected String enterName() {
        String name = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(ITEM_NAME);
            if (scanner.hasNextLine()) {
                name = scanner.nextLine();
            } else {
                throw new WrongChoice(INCORRECT_VALUE);
            }
        } catch (WrongChoice e) {
            System.out.println(e.getMessage());
            enterName();
        }
        return name;
    }

    protected void printList(String fileName, String message) throws IOException {
        File file = Path.of("resources", fileName).toFile();
        try(var reader = new BufferedReader(new FileReader(file))) {
            String text = reader
                    .lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            if (text.length() != 0) {
                System.out.println(message);
                System.out.println(text);
            } else System.out.println(LIST_IS_EMPTY);
        }
    }

    protected void addProduct() throws IOException {
        File file = Path.of("resources", FILE_PRODUCTS).toFile();
        try(var writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(new Product(enterName()).toString());
            writer.newLine();
        }
        System.out.println(PRODUCT_ADDED);
    }

    protected void createOrder() throws IOException {
        List<Product> products = new ArrayList<>();
        boolean isContinue;
        do {
            isContinue = true;
            System.out.print("""
                1 - Добавить товар в заказ.
                0 - Закончить добавление.
                """);
            switch (choiceNumber(MENU_ITEM, 1)) {
                case 1:
                    products.add(new Product(enterName()));
                    System.out.println(PRODUCT_ADDED);
                    break;
                case 0:
                    isContinue = false;
                    break;
            }
        } while (isContinue);
        if (products.size() != 0) {
            File file = Path.of("resources", FILE_ORDERS).toFile();
            try(var writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.append(new Order(products).toString());
                writer.newLine();
            }
            System.out.println(ORDER_ADDED);
        } else ordersMenu();
    }

    protected void delete(String fileName, String message) throws IOException {
        File file = Path.of("resources", fileName).toFile();
        int i = 1;
        List<String> lines = new ArrayList<>();
        try(var reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(i + ": " + line + System.lineSeparator());
                lines.add(line);
                i++;
            }
        }
        int choice = choiceNumber(DEL_POSITION_NUMBER, i);
        if (choice != 0) {
            lines.remove(choice - 1);
            if (lines.size() != 0) {
                try(var writer = new BufferedWriter(new FileWriter(file))) {
                    writer.append(lines.get(0));
                    writer.newLine();
                }
                try(var writer = new BufferedWriter(new FileWriter(file, true))) {
                    for (int j = 1; j < lines.size(); j++) {
                        writer.append(lines.toArray()[j].toString());
                        writer.newLine();
                    }
                }
            } else {
                try (var writer = new BufferedWriter(new FileWriter(file))) {
                    writer.append("");
                }
            }
            printList(fileName, message);
        } else {
            if (fileName.equals(FILE_PRODUCTS)) {
                productsMenu();
            } else ordersMenu();
        }
    }
}

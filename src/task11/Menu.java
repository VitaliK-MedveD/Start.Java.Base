package task11;

import task11.exceptions.WrongChoice;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private static final String MENU_ITEM = "Выберите пункт меню: ";
    private static final String DEL_POSITION_NUMBER = "Ведите номер позиции которую хотите удалить, " +
            System.lineSeparator() + "или введите '0' для возврата в предыдущее меню: ";
    private static final String INCORRECT_VALUE = "Некорректное значение!";
    private static final String LIST_PRODUCTS = "Текущий список товаров:";
    private static final String LIST_IS_EMPTY = "Список товаров пуст!";
    private static final String ITEM_NAME = "Введите название: ";
    private static final String EXIT = "Выход из меню.";

    public UUID setUUID() {
        Random random = new Random();
        UUID uuid = new UUID(random.nextLong(), random.nextLong());
        return uuid;
    }

    public Date setDate(){
        Date data = new Date();
        return data;
    }

    public void startMenu() {
        System.out.print("""
                      Главное меню:
                1 - Операции с товарами.
                2 - Операции с заказами.
                0 - Выход.
                """);
        switch (choiceNumber(MENU_ITEM, 2)) {
            case 1:
                productsMenu();
                break;
            case 2:
                ordersMenu();
                break;
            case 0:
                System.out.println(EXIT);
                break;
        }
    }

    private void productsMenu() {
        System.out.print("""
                      Меню товаров:
                1 - Вывести список товаров на экран.
                2 - Добавить товар.
                3 - Удалить товар.
                0 - Вернуться назад.
                """);
        switch (choiceNumber(MENU_ITEM,3)) {
            case 1:
                try {
                    printProducts();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                productsMenu();
                break;
            case 2:
                try {
                    addProduct();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                productsMenu();
                break;
            case 3:
                try {
                    deleteProduct();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 0:
                startMenu();
                break;
        }
    }

    private void ordersMenu() {
        System.out.print("""
                      Меню заказов:
                1 - Вывести список заказов на экран.
                2 - Создать заказ.
                3 - Удалить заказ.
                0 - Вернуться назад.
                """);
        switch (choiceNumber(MENU_ITEM, 3)) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
            case 0:
                startMenu();
                break;
        }
    }

    private int choiceNumber(String item, int limit) {
        int choice = 0;
        boolean isError;
        do {
            isError = false;
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
                isError = true;
            }
        } while (isError);
        return choice;
    }

    public String enterName() {
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

    private void printProducts() throws IOException {
        File file = Path.of("resources", "proudctsList.txt").toFile();
        try(var reader = new BufferedReader(new FileReader(file))) {
            String text = reader
                    .lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            if (text.length() != 0) {
                System.out.println(LIST_PRODUCTS);
                System.out.println(text);
            } else System.out.println(LIST_IS_EMPTY);
        }
    }

    private void addProduct() throws IOException {
        File file = Path.of("resources", "proudctsList.txt").toFile();
        try(var writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(new Product(enterName()).toString());
            writer.newLine();
        }
    }

    private void deleteProduct() throws IOException {
        File file = Path.of("resources", "proudctsList.txt").toFile();
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
            printProducts();
            productsMenu();
        } else productsMenu();
    }

    private void addOrder(String numberOrder) throws IOException {
        File file = Path.of("resources", numberOrder + "orderList.txt").toFile();
        try(var writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(new Product(enterName()).toString());
            writer.newLine();
        }
        File[] list = file.listFiles();
    }
}

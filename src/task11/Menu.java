package task11;

import java.io.*;

public class Menu extends Consumer{

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

    @Override
    void productsMenu() {
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
                    printList(FILE_PRODUCTS, LIST_PRODUCTS);
                } catch (IOException e) {
                    e.printStackTrace();
                    productsMenu();
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
                    delete(FILE_PRODUCTS, LIST_PRODUCTS);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                productsMenu();
                break;
            case 0:
                startMenu();
                break;
        }
    }

    @Override
    void ordersMenu() {
        System.out.print("""
                      Меню заказов:
                1 - Вывести список заказов на экран.
                2 - Создать заказ.
                3 - Удалить заказ.
                0 - Вернуться назад.
                """);
        switch (choiceNumber(MENU_ITEM, 3)) {
            case 1:
                try {
                    printList(FILE_ORDERS, LIST_ORDERS);
                } catch (IOException e) {
                    e.printStackTrace();
                    ordersMenu();
                }
                ordersMenu();
                break;
            case 2:
                try {
                    createOrder();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ordersMenu();
                break;
            case 3:
                try {
                    delete(FILE_ORDERS, LIST_ORDERS);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ordersMenu();
                break;
            case 0:
                startMenu();
                break;
        }
    }
}

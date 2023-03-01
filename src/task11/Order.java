package task11;

import java.util.*;

public class Order implements Attributes {

    private int id = setId();
    private List<Product> products;
    private String dateOrder = setDate();

    public Order(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Заказ " +
                "ID: " + id +
                "; Дата создания: " + dateOrder +
                "; Товары: " + Arrays.toString(products.toArray());
    }
}

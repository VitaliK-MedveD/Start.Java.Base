package task11;

import java.util.*;

public class Order extends Menu{

    private final UUID id = setUUID();
    private List<Product> products;
    private final Date dateOrder = setDate();

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

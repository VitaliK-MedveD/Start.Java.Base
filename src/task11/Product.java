package task11;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Product extends Menu{

    private String name;
    private Date dateProduction = setDate();
    private UUID id = setUUID();

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name +
                "; Дата производства: " + dateProduction +
                "; Идентификатор: " + id +
                ']';
    }

}

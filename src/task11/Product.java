package task11;

public class Product extends Menu{

    private String name;
    private String dateProduction = setDate();
    private int id = setId();

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name +
                "; Дата произдства: " + dateProduction +
                "; ID: " + id +
                ']';
    }

}

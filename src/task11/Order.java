package task11;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order extends Menu{

    private UUID id = setUUID();
    private List<Product> products;
    private Date dateOrder = setDate();


}

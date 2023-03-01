package task11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public interface Attributes {

    default int setId() {
        Random random = new Random();
        return random.nextInt(1000000, 10000000);
    }

    default String setDate(){
        Date date = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        return formater.format(date);
    }
}

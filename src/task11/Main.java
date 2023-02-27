package task11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        Menu menu = new Menu();
//        menu.startMenu();

        File file = Path.of("resources", "orderList.txt").toFile();
        try(var writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(new Product("вася").toString());
            writer.newLine();
        }
        File dir = Path.of("resources").toFile();
        String[] list = dir.list();
        System.out.println(Arrays.toString(list));
    }
}

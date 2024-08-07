import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 1000.0));
        list.add(new Product("Notebook", 200.0));
        list.add(new Product("Tablet", 800.0));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tablet", 350.00));    
        list.add(new Product("HD case", 50.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("Tv", 900.00));

        List<String> listName = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        listName.forEach(System.out::println);
    }
}

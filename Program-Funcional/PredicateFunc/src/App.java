import java.util.ArrayList;
import java.util.List;

import entities.Product;
import moldel.ProductService;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tablet", 350.00));    
        list.add(new Product("HD case", 50.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("Tv", 900.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum: " + sum);
    }
}

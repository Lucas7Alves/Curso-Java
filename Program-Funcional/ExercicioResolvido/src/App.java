import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\lucas\\OneDrive\\Desktop\\in.txt";
        Double sum = 0.0;
        int cont = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] produtct = line.split(",");
                list.add(new Product(produtct[0], Double.parseDouble(produtct[1])));
                line = br.readLine();
            }
            Double media = list.stream()
            .map(x -> x.getPrice())
            .reduce(0.0, (x, y) -> x + y / list.size());
            
            System.out.println("Avarege price: " + String.format("%.2f", media));
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = list.stream()
            .filter(x -> x.getPrice() > media)
            .map(x -> x.getName()).sorted(comp.reversed())
            .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

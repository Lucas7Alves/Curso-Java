import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the path: ");
        String strPath = sc.nextLine();
        List<Product> list = new ArrayList<>();
        Product p1 = null;

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String content = br.readLine();
            while (content != null) {
                String[] part = content.split(",");
                String name = part[0].substring(1);
                Double unitPrice = Double.parseDouble(part[1]);
                Integer price = Integer.parseInt(part[2].substring(0, 1));
                
                p1 = new Product(name, unitPrice, price);
                list.add(p1);
                content = br.readLine();
            }

            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lucas\\OneDrive\\Desktop\\Products\\Out\\summary.txt"))) {
            for (Product p : list) {
                bw.write(p.forCsv());
                bw.newLine();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

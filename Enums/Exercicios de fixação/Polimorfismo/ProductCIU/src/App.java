import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
       
        Scanner sc = new Scanner(System.in);
        List <Product> productsList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported? (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            if (type == 'c') {

                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                Product cProduct = new Product(name, price);
                productsList.add(cProduct);
            } else if (type == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine();

                Product iProduct = new ImportedProduct(name, price, customsFee);
                productsList.add(iProduct);

            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();

                Product uProduct = new UsedProduct(name, price, sdf.parse(date));
                productsList.add(uProduct);
            }

        }

        System.out.println("PRICE TAGS:");
        for (Product p : productsList) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}

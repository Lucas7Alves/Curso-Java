import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter client data: ");
         System.out.print("Name: ");
         String name  = sc.nextLine();
         System.out.print("Email: ");
         String email  = sc.nextLine();
         System.out.print("Bith Date (DD/MM/YYYY): ");
         Date bithDate = sdf2.parse(sc.nextLine());
         Client client = new Client(name, email, bithDate);
         
         System.out.println("Enter order data: ");
         System.out.println("Status: ");
         String status = sc.nextLine();
         Order o1 = new Order(OrderStatus.valueOf(status) , client);
         
         System.out.print("How many items to this order? ");
         int num = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name:  ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            double productPrice = sc.nextDouble();
            
            Product product = new Product(productName, productPrice);


            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            orderItem.setItem(product);
            o1.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(o1.toString());


        sc.close();
    }
}

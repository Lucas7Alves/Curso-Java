package AppAula66;

import java.util.Locale;
import java.util.Scanner;

import Aula66.Product;
public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("** Enter products  data: **");
		
		System.out.print("\nName....: ");
		product.name = sc.nextLine();
		
		System.out.print("\nPrice...:");
		product.price = sc.nextDouble();
		
		System.out.print("\nQuantity:");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println("\nAdd product: ");
		product.addProducts(sc.nextInt());
		System.out.println(product);

		System.out.printf("Update: ");
	}

}

package Aula67;

import java.util.Locale;
import java.util.Scanner;

public class AppRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("\nEnter rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter rectangle height: ");
		rectangle.height = sc.nextDouble();

		System.out.printf("\n%.2f" , rectangle.area());
		System.out.printf("\n%.2f" , rectangle.perimeter());
		System.out.printf("\n%.2f" , rectangle.diagonal());
	}

}

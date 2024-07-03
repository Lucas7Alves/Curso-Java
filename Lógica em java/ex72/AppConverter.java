package ex72;

import java.util.Locale;
import java.util.Scanner;

public class AppConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is dollar price?");
		float priceDollar = sc.nextFloat();

		System.out.println("What is dollar price?");
		float boughtDollar = sc.nextFloat();

		System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.Converter(priceDollar, boughtDollar));
		sc.close();
	}

}

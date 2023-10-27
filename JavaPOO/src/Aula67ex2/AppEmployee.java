package Aula67ex2;

import java.util.Locale;
import java.util.Scanner;

public class AppEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("\nName: ");
		employee.name = sc.nextLine();
		System.out.print("\nGross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("\nTax: ");
		employee.tax = sc.nextDouble();

		System.out.print("Employee: "+ employee.name + ", $ " +employee.netSalary()+"\n");

		
		System.out.println("Whic percentage to increase salary?");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Update data: "+ employee.grossSalary);
	}

}

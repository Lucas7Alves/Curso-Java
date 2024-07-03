package aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programming {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List <Employee> employee = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employee will be registred?");
		int choice = sc.nextInt();
		
		float salary = 0;
		int id = 0;
		for (int i = 0; i < choice; i++) {
			System.out.println("What your id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("What your name: ");
			String name = sc.nextLine();
			System.out.println("What your salary: ");
			salary = sc.nextFloat();
			employee.add(new Employee(id, name, salary));			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		
		Employee emp = employee.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Employee does not exist");
		} else {
			System.out.println("Enter the percentege: ");
			float percentage = sc.nextFloat();
			emp.increaseSalary(percentage);
		}

		System.out.println("List of employees: ");
		for (Employee employee3 : employee) {
			System.out.println(employee3.toString());
		}
		
		sc.close();
	}
	

}

package Aula67ex2;

public class Employee {

	String name;
	double grossSalary;
	double tax;
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * (percentage/100);
	}
}

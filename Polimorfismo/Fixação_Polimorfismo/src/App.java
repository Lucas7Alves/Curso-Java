import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Employee;
import entites.OutsourceEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> employeeList = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #"+i+" data: ");
            System.out.print("Outsourced? (y/n)? ");
            String ansawer = sc.nextLine();

            if (ansawer.equals("y")) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();

                Employee outSourcEmployee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(outSourcEmployee);
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                sc.nextLine();

                Employee outSourcEmployee = new Employee(name, hours, valuePerHour);
                employeeList.add(outSourcEmployee);
            }

        }
        System.out.print("PAYMENTS: ");


        for (Employee e : employeeList) {
            System.out.println(e.getName()+" - $ "+ e.payment());
        }

        sc.close();

    }
}

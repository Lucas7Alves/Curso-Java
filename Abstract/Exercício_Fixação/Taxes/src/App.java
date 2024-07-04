import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Company;
import entites.Individual;
import entites.People;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <People> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            if (type == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                Double annualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                Double healthSpeding = sc.nextDouble();
                sc.nextLine();

                list.add(new Individual(name, annualIncome, healthSpeding));
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                Double annualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                Integer employee = sc.nextInt();
                sc.nextLine();

                list.add(new Company(name, annualIncome, employee));
            }
        }

        System.err.println();
        System.out.println("TAXES PAID");
        for (People p : list) {
            System.out.println(p.getName() +": $ " + String.format("%.2f", p.taxPay()));
        }

        System.err.println();
        double sum = 0.0;
        for (People p : list) {
            sum += p.taxPay();
        }

        System.out.print("TOTAL TAXES: $ "+String.format("%.2f", sum));

        sc.close();
    }
}

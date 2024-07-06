import java.util.Locale;
import java.util.Scanner;

import models.Exceptions.DomainException;
import models.entites.Account;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account data: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, name, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            acc.withdraw(sc.nextDouble());

            System.out.print("New balance: " + acc.getBalance());
            System.out.println("Fim do programa");
        } catch (DomainException e) {
         System.out.println("Withdraw error: " + e.getMessage());   
        }

        sc.close();
    }
}

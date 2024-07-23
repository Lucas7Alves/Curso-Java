
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entites.CarRental;
import entites.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (DD/MM/YYYY): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (DD/MM/YYYY): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        
        rentalService.processInvoice(cr);

        System.out.println("INVOICE");
        System.out.print("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.print("\nTax: " + cr.getInvoice().getTax());
        System.out.print("\nTotal payment: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}

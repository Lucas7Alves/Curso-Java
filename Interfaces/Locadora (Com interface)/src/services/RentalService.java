package services;
import java.time.Duration;
import entites.CarRental;
import entites.Invoice;

public class RentalService {

  private Double pricePerHour;
  private Double pricePerDay;
  private TaxService taxService;

  public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public void processInvoice(CarRental carRental) {

    double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
    double hour = minutes / 60.0;
    double basicPayment;
    if (hour <= 12.0) {
      basicPayment = pricePerHour * Math.ceil(hour);
    } else {
      basicPayment = pricePerDay * Math.ceil(hour / 24);
    }
    double tax = taxService.taxService(basicPayment);
    carRental.setInvoice(new Invoice(basicPayment, tax));
  }
}

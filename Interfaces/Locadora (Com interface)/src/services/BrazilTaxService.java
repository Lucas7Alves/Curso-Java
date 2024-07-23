package services;

public class BrazilTaxService implements TaxService{

  public double taxService(double amount) {
    if (amount >100.0) {
      return amount * 0.15;
    } else {
      return amount * 0.20;
    }
  }
}

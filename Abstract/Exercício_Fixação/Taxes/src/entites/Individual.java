package entites;

public class Individual extends People {

  private Double healthSpending;

  //constructors
  public Individual(String name, double annualIncome, Double healthSpending) {
    super(name, annualIncome);
    this.healthSpending = healthSpending;
  }

  //method
  @Override
  public Double taxPay() {
    double sum = 0.0;
    if (getAnnualIncome() < 20000.00) {
      sum = (getAnnualIncome() * 0.15) - (healthSpending * 0.50);
    } else {
      sum = (getAnnualIncome() * 0.25) - (healthSpending * 0.50);
    }
    return sum;
  }
  //getters and setters
  public Double getHealthSpending() {
    return healthSpending;
  }

  public void setHealthSpending(Double healthSpending) {
    this.healthSpending = healthSpending;
  }
} 

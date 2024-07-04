package entites;

public abstract class People {

  private String name;
  private double annualIncome;

  //constructors
  public People(){
  }
  public People(String name, double annualIncome) {
    this.name = name;
    this.annualIncome = annualIncome;
  }

  //method
  public abstract Double taxPay();

  //getters and setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getAnnualIncome() {
    return annualIncome;
  }
  public void setAnnualIncome(double annualIncome) {
    this.annualIncome = annualIncome;
  }

  
}

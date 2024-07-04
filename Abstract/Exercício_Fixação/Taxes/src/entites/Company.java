package entites;

public class Company extends People{
  private Integer employee;

  //constructors
  public Company(String name, double annualIncome, Integer employee) {
    super(name, annualIncome);
    this.employee = employee;
  }

  //method
  @Override
  public Double taxPay() {
    double sum = 0.0;
    if (employee < 10) {
      sum = (getAnnualIncome() * 0.16);
    } else {
      sum = (getAnnualIncome() * 0.14);
    }
    return sum;
  }

  //getters and setters
  public Integer getEmployee() {
    return employee;
  }


  public void setEmployee(Integer employee) {
    this.employee = employee;
  }
}

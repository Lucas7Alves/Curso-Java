package entites;

public class OutsourceEmployee extends Employee {

  private Double additionalCharge;


  
  
  //constructors
  public OutsourceEmployee(Double additionalCharge) {
    super();
  }
  public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
  }

  public Double payment(){
    return super.payment() + additionalCharge * 1.10;
  }

  //getters and setters
  public Double getAdditionalCharge() {
    return additionalCharge;
  }
  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }
}

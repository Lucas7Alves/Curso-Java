package worker;

import java.util.Date;

public class HourContract {
  private Date date;
  private Double valuePerHour;
  private Integer hours;

//construtor
public HourContract(){
}

public HourContract(Date date, Double valuePerHour, Integer hours) {
  this.date = date;
  this.valuePerHour = valuePerHour;
  this.hours = hours;
}


//metodos da classe
  public double totalValue() {
    return valuePerHour * hours;
  }


  //getters and setters
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public double getValuePerHour() {
    return valuePerHour;
  }

  public void setValuePerHour(double valuePerHour) {
    this.valuePerHour = valuePerHour;
  }

  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }
}

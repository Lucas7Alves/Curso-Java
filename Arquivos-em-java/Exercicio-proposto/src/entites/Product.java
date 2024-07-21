package entites;

public class Product {

  private String name;
  private Double unitPrice;
  private Integer unit;

  public Product(String name, Double unitPrice, Integer unit) {
    this.name = name;
    this.unitPrice = unitPrice;
    this.unit = unit;
  }

  public double totalValue() {
    return unit * unitPrice;
  }

  public String forCsv() {
    return String.format(name +"," + "%.2f", totalValue());
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Double getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }
  public Integer getUnit() {
    return unit;
  }
  public void setUnit(Integer unit) {
    this.unit = unit;
  }

  
}

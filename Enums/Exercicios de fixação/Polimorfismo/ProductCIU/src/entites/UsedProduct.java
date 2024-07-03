package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

  private Date manufacture;
  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  //ctc
  public UsedProduct() {
  }

  public UsedProduct(String name, Double price, Date manufacture) {
    super(name, price);
    this.manufacture = manufacture;
  }

  //metodos
  @Override 
  public String priceTag() {
    return getName() +" (used) " + "$ " + String.format("%.2f", getPrice()) + " (Manufacture date: "+ sdf.format(getManufacture()) + ")";
  }



  // getters and setters
  public Date getManufacture() {
    return manufacture;
  }
  public void setManufacture(Date manufacture) {
    this.manufacture = manufacture;
  }

  
}

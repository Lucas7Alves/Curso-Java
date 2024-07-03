package entites;

public class OrderItem {
  private Integer quantity;
  private Double price;
  private Product item;

  public double subTotal() {
    return quantity * price;
  }

  // contructors
  public OrderItem(Integer quantity, Double price, Product item) {
    this.item = item;
    this.quantity = quantity;
    this.price = price;
  }

  //getters and setters
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  public Product getItem() {
    return item;
  }
  public void setItem(Product item) {
    this.item = item;
  }


}

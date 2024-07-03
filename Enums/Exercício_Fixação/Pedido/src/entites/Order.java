package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {

  private Date moment;
  private OrderStatus status;
  private Client client;

  public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

  private List <OrderItem> items = new ArrayList<>();


  //contructors
  public Order(OrderStatus status, Client client) {
    this.moment = new Date();
    this.status = status;
    this.client = client;
  }
  public Order() {
  }

  //metodos
  public void addItem(OrderItem orderItem){
    items.add(orderItem);
  }

  public void removeItem(OrderItem orderItem){
    items.remove(orderItem);
  }

  public double total() {
    double sum = 0;
    for (OrderItem o : items) {
      sum += o.subTotal();
    }
    return sum;
  }


  //getters and setters
  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  } 
  
  public List<OrderItem> getOrderItems() {
    return items;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: " + moment + "\n");
    sb.append("Order status: " + getStatus() + "\n");
    sb.append("Client: " + client.getName());
    sb.append(" "+ client.getBithDate());
    sb.append(" - " + client.getEmail() + "\n");
    sb.append("Order items: \n");
    for (OrderItem o : items) {
      sb.append(o.getItem().getName());
      sb.append(", $" + o.getPrice());
      sb.append(", Quantity: " + o.getQuantity());
      sb.append(", Subtotal: $" + o.subTotal() + "\n");
    }
    sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
    
    return sb.toString();

  }
  
}

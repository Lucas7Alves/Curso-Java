import java.util.Date;

import entites.Order;
import entites.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        
        // System.out.println(order);

        OrderStatus os2 = OrderStatus.DELIVERED.valueOf("DELIVERED");

        System.out.println(os2);
    }
}

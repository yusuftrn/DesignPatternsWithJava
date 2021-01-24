package structural.facade.facadeExample2.facade;

import structural.facade.facadeExample2.commerce.Cargo;
import structural.facade.facadeExample2.commerce.Cart;
import structural.facade.facadeExample2.commerce.Client;
import structural.facade.facadeExample2.orders.OrderDetails;
import structural.facade.facadeExample2.orders.OrderProcess;
import structural.facade.facadeExample2.orders.StockProcess;

import java.util.Date;
import java.util.List;

public class OrderFacade {

    private Client client;
    private Cargo deliver;

    private StockProcess stockProcess = new StockProcess();
    private OrderDetails orderDetails = new OrderDetails();
    private OrderProcess orderProcess = new OrderProcess();

    public void Order(String clientName, String deliverName, List<Cart> cartList){

        client = new Client();
        client.setName(clientName);

        deliver = new Cargo();
        deliver.setDeliverName(deliverName);

        int orderID = orderProcess.addOrder(new Date(System.currentTimeMillis()), client, deliver);

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.addOrderDetails(orderID, cartList);
        System.out.println("Order completed.");

    }

}

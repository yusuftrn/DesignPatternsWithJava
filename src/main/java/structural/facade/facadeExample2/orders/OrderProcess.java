package structural.facade.facadeExample2.orders;

import structural.facade.facadeExample2.commerce.Cargo;
import structural.facade.facadeExample2.commerce.Client;

import java.util.Date;

public class OrderProcess {

    public int addOrder(Date orderDate, Client client, Cargo cargo){
        System.out.println("Order Date: " + orderDate);
        System.out.println("Client Name: " + client.getName());
        System.out.println("Cargo Deliver: " + cargo.getDeliverName());
        return 1;
    }
}

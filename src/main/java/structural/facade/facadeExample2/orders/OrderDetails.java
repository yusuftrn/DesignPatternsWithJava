package structural.facade.facadeExample2.orders;

import structural.facade.facadeExample2.commerce.Cart;

import java.util.List;

public class OrderDetails {

    public void addOrderDetails(int orderId, List<Cart> cartItems){
        System.out.println("Items from cart OrderID: " + orderId);
        System.out.println("--------------");
        for(Cart c : cartItems){
            System.out.println(c.getProductName() + " item sold " + c.getProductCount() + " pieces total cost: " + c.getProductPrice()*c.getProductCount() + "$");
        }

    }
}

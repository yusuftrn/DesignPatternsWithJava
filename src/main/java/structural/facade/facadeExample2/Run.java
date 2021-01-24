package structural.facade.facadeExample2;

import structural.facade.facadeExample2.commerce.Cart;
import structural.facade.facadeExample2.facade.OrderFacade;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();
        ArrayList<Cart> cartArrayList = new ArrayList<>();
        cartArrayList.add(new Cart(1, "Apple TV", 5, 500));
        cartArrayList.add(new Cart(2, "Macbook Pro", 2, 2400));
        cartArrayList.add(new Cart(3, "iPhone12", 4, 990));

        orderFacade.Order("Yusuf Turan", "Aras Kargo", cartArrayList);
    }
}
/*
Order Date: Sun Jan 24 23:25:37 TRT 2021
Client Name: Yusuf Turan
Cargo Deliver: Aras Kargo
Items from cart OrderID: 1
--------------
Apple TV item sold 5 pieces total cost: 2500.0$
Macbook Pro item sold 2 pieces total cost: 4800.0$
iPhone12 item sold 4 pieces total cost: 3960.0$
Product ID: 1 Count:5 items sold.
Product ID: 2 Count:2 items sold.
Product ID: 3 Count:4 items sold.
Order completed.
 */

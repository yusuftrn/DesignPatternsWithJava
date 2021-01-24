package structural.facade.facadeExample2.orders;

public class StockProcess {

    public void updateStock(int productId, int productCount){
        System.out.println("Product ID: " + productId + " Count:" + productCount + " items sold.");
    }
}

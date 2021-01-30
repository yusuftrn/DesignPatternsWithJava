package behavioral.commandPattern.commandExample3.stocks;

public class StockManager {

    private String name;
    private int quantity;

    public StockManager(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        String message = String.format("Stock: %s, %s bought!", name, quantity);
        System.out.println(message);
    }

    public void sell(){
        String message = String.format("Stock: %s, %s sold!", name, quantity);
        System.out.println(message);
    }
}

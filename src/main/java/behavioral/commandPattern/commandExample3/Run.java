package behavioral.commandPattern.commandExample3;

import behavioral.commandPattern.commandExample3.commands.BuyStock;
import behavioral.commandPattern.commandExample3.commands.SellStock;
import behavioral.commandPattern.commandExample3.stocks.StockController;
import behavioral.commandPattern.commandExample3.stocks.StockManager;

public class Run {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager("Iphone", 200);

        BuyStock buyStock = new BuyStock(stockManager);
        SellStock sellStock = new SellStock(stockManager);

        StockController stockController = new StockController();

        stockController.takeOrder(buyStock);
        stockController.takeOrder(sellStock);
        stockController.takeOrder(sellStock);

        stockController.placeOrder();
    }
}

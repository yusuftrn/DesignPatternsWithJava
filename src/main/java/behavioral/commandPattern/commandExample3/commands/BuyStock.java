package behavioral.commandPattern.commandExample3.commands;

import behavioral.commandPattern.commandExample3.stocks.StockManager;

public class BuyStock implements OrderCommand {

    private StockManager stockManager;

    public BuyStock(StockManager stockManager){
        this.stockManager = stockManager;
    }

    @Override
    public void execute() {
        stockManager.buy();
    }
}

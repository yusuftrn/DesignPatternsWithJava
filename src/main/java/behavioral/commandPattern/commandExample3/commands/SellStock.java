package behavioral.commandPattern.commandExample3.commands;

import behavioral.commandPattern.commandExample3.stocks.StockManager;

public class SellStock implements OrderCommand {

    private StockManager stockManager;

    public SellStock(StockManager stockManager){
        this.stockManager = stockManager;
    }

    @Override
    public void execute() {
        stockManager.sell();
    }
}

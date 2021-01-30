package behavioral.commandPattern.commandExample3.stocks;

import behavioral.commandPattern.commandExample3.commands.OrderCommand;

import java.util.ArrayList;
import java.util.List;

public class StockController {
    private List<OrderCommand> orderCommandList;

    public StockController(){
        orderCommandList = new ArrayList<>();
    }

    public void takeOrder(OrderCommand command){
        orderCommandList.add(command);
    }

    public void placeOrder(){
        for(OrderCommand command : orderCommandList){
            command.execute();
        }
        orderCommandList.clear();
    }
}

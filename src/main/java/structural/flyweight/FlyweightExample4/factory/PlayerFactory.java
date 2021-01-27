package structural.flyweight.FlyweightExample4.factory;

import structural.flyweight.FlyweightExample4.player.CounterTerrorist;
import structural.flyweight.FlyweightExample4.player.Player;
import structural.flyweight.FlyweightExample4.player.Terrorist;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> playerHashMap = new HashMap<>();

    public static Player getPlayer(String type){
        Player player = null;

        if(playerHashMap.containsKey(type)){
            player = playerHashMap.get(type);
        }
        else{
            switch (type){
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }
            playerHashMap.put(type, player);
        }
        return player;
    }
}

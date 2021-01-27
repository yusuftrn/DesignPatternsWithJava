package structural.flyweight.FlyweightExample4;

import structural.flyweight.FlyweightExample4.factory.PlayerFactory;
import structural.flyweight.FlyweightExample4.player.Player;

import java.util.Random;

//CounterStrike Main Driver
public class Run {

    private static int playerCount = 10;
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args){
        for(int i=0; i < playerCount; i++){
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());
            p.assignWeapon(getRandomWeapon());
            p.mission();
        }
    }

    private static String getRandomPlayerType() {
        Random randomPlayer = new Random();
        int randInt = randomPlayer.nextInt(playerType.length);
        return playerType[randInt];
    }

    private static String getRandomWeapon() {
        Random randomWeapon = new Random();
        int randInt = randomWeapon.nextInt(weapons.length);
        return weapons[randInt];
    }
}
/*
Terrorist Created
Terrorist with Maverick | TASK is: PLANT a BOMB
Terrorist with Gut Knife | TASK is: PLANT a BOMB
Counter Terrorist Created
CounterTerrorist with Desert Eagle | TASK is: DIFFUSE BOMB
Terrorist with Desert Eagle | TASK is: PLANT a BOMB
CounterTerrorist with Maverick | TASK is: DIFFUSE BOMB
CounterTerrorist with Gut Knife | TASK is: DIFFUSE BOMB
CounterTerrorist with Maverick | TASK is: DIFFUSE BOMB
Terrorist with Desert Eagle | TASK is: PLANT a BOMB
Terrorist with AK-47 | TASK is: PLANT a BOMB
CounterTerrorist with AK-47 | TASK is: DIFFUSE BOMB
 */
/*
NOTE: Check the output:
Terrorist and CounterTerrorist objects created one times.
 */
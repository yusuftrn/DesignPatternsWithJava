package behavioral.commandPattern.commandExample2;

import behavioral.commandPattern.commandExample2.devices.Remote;

public class Run {
    public static void main(String[] args) {
        Remote remoteController = new Remote();

        remoteController.pressButton(0);

        remoteController.pressButton(1);

    }
}
/*OUTPUT:
Stock: Iphone, 200 bought!
Stock: Iphone, 200 sold!
Stock: Iphone, 200 sold!
 */
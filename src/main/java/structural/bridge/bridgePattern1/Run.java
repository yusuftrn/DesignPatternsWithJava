package structural.bridge.bridgePattern1;

import structural.bridge.bridgePattern1.devices.Device;
import structural.bridge.bridgePattern1.devices.Radio;
import structural.bridge.bridgePattern1.devices.TV;
import structural.bridge.bridgePattern1.remotes.AdvancedRemote;
import structural.bridge.bridgePattern1.remotes.BasicRemote;

public class Run {

    public static void main(String[] args){
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.channelUp();
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

/*OUTPUT:
Tests with basic remote
Remote: channel up
Remote: power toggle
------------------------------------
| I'm TV
| I'm enabled
| Current volume is 30%
| Current channel is 2
------------------------------------

Tests with advanced remote
Remote: power toggle
Remote: mute
------------------------------------
| I'm TV
| I'm disabled
| Current volume is 0%
| Current channel is 2
------------------------------------

Tests with basic remote
Remote: channel up
Remote: power toggle
------------------------------------
| I'm Radio
| I'm enabled
| Current volume is 30%
| Current channel is 2
------------------------------------

Tests with advanced remote
Remote: power toggle
Remote: mute
------------------------------------
| I'm Radio
| I'm disabled
| Current volume is 0%
| Current channel is 2
------------------------------------
 */

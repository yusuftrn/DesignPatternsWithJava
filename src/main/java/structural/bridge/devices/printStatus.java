package structural.bridge.devices;

public class printStatus {
    static void printOut(String deviceType, boolean onOffStatus, int volumePercent, int channel) {
        System.out.println("------------------------------------");
        System.out.println("| I'm " + deviceType);
        System.out.println("| I'm " + (onOffStatus ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volumePercent + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}

package structural.bridge.bridgePattern1.devices;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volumePercent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}

package structural.bridge.devices;

public class Radio implements Device {
    private final String  deviceType = "Radio";
    private boolean onOffStatus = false;
    private int volumePercent = 30;
    private int channel = 1;


    @Override
    public boolean isEnabled() {
        return onOffStatus;
    }

    @Override
    public void enable() {
        if(!onOffStatus){
            onOffStatus = true;
        }
    }

    @Override
    public void disable() {
        if(onOffStatus){
            onOffStatus = false;
        }
    }

    @Override
    public int getVolume() {
        return volumePercent;
    }

    @Override
    public void setVolume(int volumePercent) {
        if(volumePercent > 100){
            this.volumePercent = 100;
        }
        else if(volumePercent < 0){
            this.volumePercent = 0;
        }
        else{
            this.volumePercent = volumePercent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        printStatus.printOut(deviceType, onOffStatus, volumePercent, channel);
    }
}

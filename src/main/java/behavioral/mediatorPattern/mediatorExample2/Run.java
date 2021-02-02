package behavioral.mediatorPattern.mediatorExample2;

import behavioral.mediatorPattern.mediatorExample2.devices.Computer;
import behavioral.mediatorPattern.mediatorExample2.devices.ElectronicDevice;
import behavioral.mediatorPattern.mediatorExample2.devices.Radio;
import behavioral.mediatorPattern.mediatorExample2.devices.Television;
import behavioral.mediatorPattern.mediatorExample2.mediator.Mediator;

//Also used for client.
public class Run {
    public static void main(String[] args) {
        final Mediator mediator = new Mediator();

        //Create an array for electronic devices, Then put devices in it.
        final ElectronicDevice[] devices = new ElectronicDevice[3];
        devices[0] = new Computer(mediator);
        devices[1] = new Television(mediator);
        devices[2] = new Radio(mediator);

        //iterate the devices array, and start them.
        for(final ElectronicDevice device : devices){
            device.runDevice();
        }
    }
}

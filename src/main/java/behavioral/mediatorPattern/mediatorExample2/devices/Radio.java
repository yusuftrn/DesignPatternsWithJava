package behavioral.mediatorPattern.mediatorExample2.devices;

import behavioral.mediatorPattern.mediatorExample2.mediator.Mediator;

public class Radio implements ElectronicDevice {

    private Mediator mediator;

    public Radio(Mediator mediator){
        this.mediator = mediator;
        mediator.addRadio(this);
    }

    @Override
    public void runDevice() {
        System.out.println("\nRadio RUNS..");
        mediator.runRadio();
    }

    @Override
    public void stopDevice() {
        System.out.println("Radio stops..");
    }
}

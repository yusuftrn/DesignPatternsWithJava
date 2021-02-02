package behavioral.mediatorPattern.mediatorExample2.devices;

import behavioral.mediatorPattern.mediatorExample2.mediator.Mediator;

public class Television implements ElectronicDevice {

    private Mediator mediator;

    public Television(Mediator mediator) {
        this.mediator = mediator;
        mediator.addTelevision(this);
    }

    @Override
    public void runDevice() {
        System.out.println("\nTelevision RUNS..");
        mediator.runTelevision();
    }

    @Override
    public void stopDevice() {
        System.out.println("Television stops..");
    }
}

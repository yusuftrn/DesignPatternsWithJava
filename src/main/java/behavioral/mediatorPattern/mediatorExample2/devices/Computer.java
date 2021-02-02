package behavioral.mediatorPattern.mediatorExample2.devices;

import behavioral.mediatorPattern.mediatorExample2.mediator.Mediator;

public class Computer implements ElectronicDevice {

    private Mediator mediator;

    public Computer(Mediator mediator){
        this.mediator = mediator;
        mediator.addComputer(this);
    }

    @Override
    public void runDevice() {
        System.out.println("\nComputer RUNS..");
        mediator.runComputer();
    }

    @Override
    public void stopDevice() {
        System.out.println("Computer stopped..");
    }
}

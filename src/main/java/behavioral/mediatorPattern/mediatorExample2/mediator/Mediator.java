package behavioral.mediatorPattern.mediatorExample2.mediator;

import behavioral.mediatorPattern.mediatorExample2.devices.Computer;
import behavioral.mediatorPattern.mediatorExample2.devices.Radio;
import behavioral.mediatorPattern.mediatorExample2.devices.Television;

public class Mediator {
    private Computer computer;
    private Television television;
    private Radio radio;

    public void addComputer(final Computer computer){
        this.computer = computer;
    }

    public void addRadio(final Radio radio){
        this.radio = radio;
    }

    public void addTelevision(final Television television){
        this.television = television;
    }
    public void runComputer(){
        //When computer runs, other devices stops.
        television.stopDevice();
        radio.stopDevice();
    }

    public void runRadio(){
        //When radio runs, other devices stops.
        computer.stopDevice();
        television.stopDevice();
    }

    public void runTelevision(){
        //When television runs, other devices stops.
        television.stopDevice();
        computer.stopDevice();
    }
}

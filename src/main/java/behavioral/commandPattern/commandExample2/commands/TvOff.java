package behavioral.commandPattern.commandExample2.commands;

import behavioral.commandPattern.commandExample2.devices.TV;

public class TvOff implements Command {

    private TV tv = null;

    public TvOff(TV tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        this.tv.tvOff();
    }
}

package behavioral.commandPattern.commandExample2.commands;

import behavioral.commandPattern.commandExample2.devices.TV;

public class TvOn implements Command {

    private TV tv = null;

    public TvOn(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.tvOn();
    }
}

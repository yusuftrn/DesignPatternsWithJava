package behavioral.commandPattern.commandExample2.devices;

import behavioral.commandPattern.commandExample2.commands.Command;
import behavioral.commandPattern.commandExample2.commands.TvOff;
import behavioral.commandPattern.commandExample2.commands.TvOn;

public class Remote {
    public Command[] button = new Command[2];

    public Remote(){
        final TV tv = new TV();
        button[0] = new TvOn(tv);
        button[1] = new TvOff(tv);
    }

    public void pressButton(final int i){
        if(i > button.length || i < 0){
            throw new RuntimeException("" + "Wrong input.");
        }
        button[i].execute();
    }
}

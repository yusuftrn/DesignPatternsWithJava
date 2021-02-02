package behavioral.mediatorPattern.mediatorExample1.components;

import behavioral.mediatorPattern.mediatorExample1.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {

    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void fireActionPerformed(ActionEvent actionEvent){
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}

package behavioral.mediatorPattern.mediatorExample1;

import behavioral.mediatorPattern.mediatorExample1.components.*;
import behavioral.mediatorPattern.mediatorExample1.mediator.Editor;
import behavioral.mediatorPattern.mediatorExample1.mediator.Mediator;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
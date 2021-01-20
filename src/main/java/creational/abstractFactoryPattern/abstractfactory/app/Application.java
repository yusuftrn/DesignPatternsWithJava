package creational.abstractFactoryPattern.abstractfactory.app;

import creational.abstractFactoryPattern.abstractfactory.buttons.Button;
import creational.abstractFactoryPattern.abstractfactory.checkboxes.Checkbox;
import creational.abstractFactoryPattern.abstractfactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete creational.factoryPattern.factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

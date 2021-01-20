package creational.abstractFactoryPattern.abstractfactory.factories;

import creational.abstractFactoryPattern.abstractfactory.buttons.Button;
import creational.abstractFactoryPattern.abstractfactory.buttons.MacOSButton;
import creational.abstractFactoryPattern.abstractfactory.checkboxes.Checkbox;
import creational.abstractFactoryPattern.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete creational.factoryPattern.factory extends basic creational.factoryPattern.factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

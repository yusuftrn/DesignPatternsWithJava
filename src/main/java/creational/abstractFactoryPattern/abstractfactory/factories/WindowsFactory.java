package creational.abstractFactoryPattern.abstractfactory.factories;

import creational.abstractFactoryPattern.abstractfactory.buttons.Button;
import creational.abstractFactoryPattern.abstractfactory.buttons.WindowsButton;
import creational.abstractFactoryPattern.abstractfactory.checkboxes.Checkbox;
import creational.abstractFactoryPattern.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete creational.factoryPattern.factory extends basic creational.factoryPattern.factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

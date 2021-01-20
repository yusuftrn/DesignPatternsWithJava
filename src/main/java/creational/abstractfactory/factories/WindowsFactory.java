package creational.abstractfactory.factories;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.buttons.WindowsButton;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete creational.factory extends basic creational.factory and responsible for creating
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

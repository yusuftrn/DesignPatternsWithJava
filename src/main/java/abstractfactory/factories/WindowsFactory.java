package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.buttons.WindowsButton;
import abstractfactory.checkboxes.Checkbox;
import abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
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

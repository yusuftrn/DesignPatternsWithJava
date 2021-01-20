package creational.abstractFactoryPattern.abstractfactory.factories;

import creational.abstractFactoryPattern.abstractfactory.buttons.Button;
import creational.abstractFactoryPattern.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract creational.factoryPattern.factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

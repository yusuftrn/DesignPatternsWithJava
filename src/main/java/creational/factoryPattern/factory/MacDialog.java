package creational.factoryPattern.factory;

import creational.factoryPattern.factory.buttons.Button;
import creational.factoryPattern.factory.buttons.MacButton;

public class MacDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}

package creational.factory;

import creational.factory.buttons.Button;
import creational.factory.buttons.MacButton;

public class MacDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}

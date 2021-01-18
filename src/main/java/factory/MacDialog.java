package factory;

import factory.buttons.Button;
import factory.buttons.MacButton;

public class MacDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}

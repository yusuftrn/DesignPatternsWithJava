package factory;

import factory.buttons.Button;
import factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

package creational.factoryPattern.factory;

import creational.factoryPattern.factory.buttons.Button;
import creational.factoryPattern.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

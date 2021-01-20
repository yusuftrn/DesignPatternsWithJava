package creational.factoryPattern.factory;

import creational.factoryPattern.factory.buttons.Button;

/**
 * Base creational.factoryPattern.factory class. Note that "creational.factoryPattern.factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}

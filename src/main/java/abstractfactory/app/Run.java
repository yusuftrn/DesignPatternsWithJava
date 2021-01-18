package abstractfactory.app;

import abstractfactory.factories.GUIFactory;
import abstractfactory.factories.MacOSFactory;
import abstractfactory.factories.WindowsFactory;

import java.util.Locale;

/**
 * Run class. Everything comes together here.
 */
public class Run {

    /*
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication(){
        Application app;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
        }
        else{
            guiFactory = new WindowsFactory();
        }
        app = new Application(guiFactory);

        return app;
    }

    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}

package creational.factoryPattern.factory;

/**
 * Demo class. Everything comes together here.
 */
public class Run {

    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBussinessLogic();
    }

    /**
     *  The concrete creational.factoryPattern.factory is usually chosen depending on configuration or environment options
     */
    private static void configure(){
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            dialog = new MacDialog();
        }
        else{
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which creational.factoryPattern.factory it works
     * with and what kind of product it returns.
     */
    private static void runBussinessLogic(){
        dialog.renderWindow();
    }
}

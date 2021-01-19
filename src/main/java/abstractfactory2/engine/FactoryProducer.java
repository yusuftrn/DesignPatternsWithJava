package abstractfactory2.engine;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        else if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        return null;
    }
}

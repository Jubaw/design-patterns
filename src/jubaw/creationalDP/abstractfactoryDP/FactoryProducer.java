package jubaw.creationalDP.abstractfactoryDP;


//Factory of Factories


public class FactoryProducer {

    public static AbstractFactory getFactory(String select){
        if (select.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }else if(select.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }

}

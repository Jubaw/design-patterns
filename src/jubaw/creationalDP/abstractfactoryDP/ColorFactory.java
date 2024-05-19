package jubaw.creationalDP.abstractfactoryDP;

public class ColorFactory implements AbstractFactory<Color>{


    @Override
    public Color getObject(String objectType) {
        return getColor(objectType);
    }

    public Color getColor(String color){

        if (color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }



}

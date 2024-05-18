package jubaw.creationalDP.abstractfactoryDP;


public class ShapeFactory implements AbstractFactory<Shape>{

    @Override
    public Shape getObject(String objectType) {
        return getShape(objectType);
    }




    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("Triangle")) {
            return new Triangle("Triangle",60,3);

        } else if (type .equalsIgnoreCase("Square")) {
            return new Square("Square", 4, 90);

        } else if (type.equalsIgnoreCase("Pentagon")) {
            return new Pentagon("Pentagon", 5, 108);
        }
        return null;
    }



}

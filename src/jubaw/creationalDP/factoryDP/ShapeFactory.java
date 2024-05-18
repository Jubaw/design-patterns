package jubaw.creationalDP.factoryDP;

public class ShapeFactory {

    public static Shape getShape(ShapeType type) {
        if (type == ShapeType.TRIANGLE) {
            return new Triangle("Triangle", 3, 60);

        } else if (type == ShapeType.SQUARE) {
            return new Square("Square", 4, 90);

        } else if (type == ShapeType.PENTAGON) {
            return new Pentagon("Pentagon", 5, 108);
        }
        return null;
    }


}

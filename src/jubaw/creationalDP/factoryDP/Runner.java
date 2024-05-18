package jubaw.creationalDP.factoryDP;

public class Runner {
    public static void main(String[] args) {

        Shape triangle = new Triangle("Triangle",3,60);
        triangle.draw();

        Shape square = new Square("Square",4,90);
        square.draw();

        Shape pentagon = new Pentagon("Pentagon",5,108);
        pentagon.draw();

        //Without knowing the Constructor of the object or domain class, we want to use the object here.
        //For this, FACTORY METHOD DESIGN PATTERN should be used. We created Enum class for it, and added ShapeFactory class.

        System.out.println("============================================");
        Shape triangleSF = ShapeFactory.getShape(ShapeType.TRIANGLE);
        triangleSF.draw();

        Shape squareSF = ShapeFactory.getShape(ShapeType.SQUARE);
        squareSF.draw();

        //Because new keyword is not used, the class is not tied closely to the Square/Triangle/Pentagon class.


    }
}

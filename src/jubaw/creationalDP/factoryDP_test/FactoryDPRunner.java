package jubaw.creationalDP.factoryDP_test;

//import jubaw.creationalDP.factoryDP.Square;

import jubaw.creationalDP.factoryDP.Shape;
import jubaw.creationalDP.factoryDP.ShapeFactory;
import jubaw.creationalDP.factoryDP.ShapeType;

public class FactoryDPRunner {
    public static void main(String[] args) {


//        Square square = new Square();

        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}

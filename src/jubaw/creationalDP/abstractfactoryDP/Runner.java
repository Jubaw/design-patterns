package jubaw.creationalDP.abstractfactoryDP;

public class Runner {
    public static void main(String[] args) {

       AbstractFactory<Shape> shape =  FactoryProducer.getFactory("Shape");
       Shape square = shape.getObject("Square");
       square.draw();

       AbstractFactory<Color > colorFactory  = FactoryProducer.getFactory("Color");
       Color blue = colorFactory.getObject("Blue");
       blue.fill();

        System.out.println("===========================");

        Shape triangle = (Shape) FactoryProducer.getFactory("Shape").getObject("Triangle");
        triangle.draw();

        Color red = (Color) FactoryProducer.getFactory("Color").getObject("Red");
        red.fill();




    }
}

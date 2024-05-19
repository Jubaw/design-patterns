package jubaw.structuralDP.decoratorDP;

public class Iphone11Pro extends PhoneDecorator{
    public Iphone11Pro(Iphone basicPhone) {
        super(basicPhone);
    }


    public String getModel(){
        return "11 Pro";
    }

    public void roundEdges(){
        System.out.println("Edges have been rounded");
    }
}

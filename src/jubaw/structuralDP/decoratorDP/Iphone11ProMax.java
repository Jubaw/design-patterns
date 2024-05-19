package jubaw.structuralDP.decoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);
    }

    //Adding extra features to 11 pro, making it Max

    public String addColor(){
        return "GOLD";
    }

    //We can change 11 pro getModel

    @Override
    public String getModel() {
        return super.getModel() + " Max";
    }
}

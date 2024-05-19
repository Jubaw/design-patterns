package jubaw.structuralDP.decoratorDP;

public class Iphone implements Phone{ //primitive iphone
    @Override
    public String getName() {
        return "Iphone";
    }

    @Override
    public int getCameraCount() {
        return 3;
    }

    @Override
    public double getPrice() {
        return 15000;
    }
}

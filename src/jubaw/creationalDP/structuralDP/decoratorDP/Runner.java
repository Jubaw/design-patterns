package jubaw.creationalDP.structuralDP.decoratorDP;

public class Runner {

    public static void main(String[] args) {

        System.out.println("============Primitive Object===============");
        Iphone iphone = new Iphone();
        System.out.println(iphone.getName());
        System.out.println(iphone.getPrice());
        System.out.println(iphone.getCameraCount());

        System.out.println("============Decorated Object===============");
//        Iphone basicIphone = new Iphone();
//        Iphone11Pro iphone11Pro = new Iphone11Pro(basicIphone);
        Iphone11Pro iphone11Pro = new Iphone11Pro(new Iphone());

        System.out.println(iphone11Pro.getName());
        System.out.println(iphone11Pro.getModel());
        System.out.println(iphone11Pro.getCameraCount());
        System.out.println(iphone11Pro.getPrice());
        iphone11Pro.roundEdges();

        System.out.println("============Pro Max===============");
        Iphone11ProMax iphone11ProMax = new Iphone11ProMax(new Iphone());
        System.out.println(iphone11ProMax.getName());
        System.out.println(iphone11ProMax.getModel());
        System.out.println(iphone11ProMax.getCameraCount());
        System.out.println(iphone11ProMax.getPrice());
        iphone11ProMax.roundEdges();
        System.out.println(iphone11ProMax.addColor());


    }
}

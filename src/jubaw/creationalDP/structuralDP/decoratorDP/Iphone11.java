package jubaw.creationalDP.structuralDP.decoratorDP;

public class Iphone11 extends PhoneDecorator{



    public Iphone11(Iphone Iphone) {
        super(Iphone);
    }

    //Has all the features of primitive Iphone.
    //Lets add new features to Iphone11

    public String getModel(){
        return "11";
    }

}

package jubaw.structuralDP.proxyDP;

public class Runner {

    public static void main(String[] args) {

        RealClass realObject = new RealClass("C:\\image1.jpeg");
        System.out.println(realObject.name);
        realObject.changeFormat();
        System.out.println("----------------------- Proxy -----------------");

        //otherMethod(ImageGenerator object);
        //if we give realOjbect to this method, we lose  performance,time etc. for no reason.
        //Instead, by using proxy object, we would put off loading image unneccesarily and  increase the performance.

        ProxyClass proxyClass = new ProxyClass("C:\\image1.jpeg"); //Image not been loaded, its a pseudo-object.
        //proxyClass.name is not available because the object has not been created yet

        proxyClass.showImage(); //Now the object has been created
        // proxyClass.changeFormat(); doesnt have the autharization for other methods,
        //Original object's management has been handled through this way.


    }
}

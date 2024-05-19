package jubaw.structuralDP.proxyDP;

public class RealClass implements ImageGenerator {

    public String fullPath;

    public String name;

    public RealClass(String fullPath) {
        this.fullPath = fullPath;
        this.name = "Image";
        loadImage();//When object created, load image from database
    }

    @Override
    public void showImage() {
        System.out.println(this.name + " is being shown... Path: " + this.fullPath);
    }

    public void loadImage() {
        System.out.println("Image is being loaded...");
    }

    //Extra methods...
    public void changeFormat(){
        //Other objects are being used here...
    }



}

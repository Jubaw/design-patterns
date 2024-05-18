package jubaw.creationalDP.singletonDP;

public class SingletonObject {

    public String message = "Hello";

    private static SingletonObject instance;


    //Added private constructor so that object cannot be created with different refence
    private SingletonObject() {
    }

    public static SingletonObject getInstance(){
        if (instance == null){ // When method called at first, it creates a new object, for futher callings, it returns the same object.
            instance = new SingletonObject();
        }
        return instance;
    }

    public void changeMessage(){
        this.message = "Design pattern";
    }

}

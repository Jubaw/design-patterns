package jubaw.creationalDP.singletonDP;

public class Runner {
    public static void main(String[] args) {
//        SingletonObject singletonObject1 = new SingletonObject();
//        SingletonObject singletonObject2 = new SingletonObject();
//        System.out.println(singletonObject1.equals(singletonObject2));


        //References are different
        System.out.println("=====================================");

        SingletonObject singletonObject3 = SingletonObject.getInstance();
        SingletonObject singletonObject4 = SingletonObject.getInstance();
        System.out.println(singletonObject3.equals(singletonObject4));

        System.out.println("===============Object 3 Message=====================");

        System.out.println(singletonObject3.message); //Hello
        singletonObject3.changeMessage();
        System.out.println(singletonObject3.message); //Design pattern

        System.out.println("===============Object 4 Message=====================");
        System.out.println(singletonObject4.message);


    }
}

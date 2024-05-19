package jubaw.creationalDP.prototypeDP;

public class Runner {

    public static void main(String[] args) {

        Soldier soldierAvailable = new Soldier(100, true, 20, 60, "Sword"); //80 SOLDIER
        Soldier soldierNotAvailable = new Soldier(100, false, 20, 60, "Sword");//20 SOLDIER
        Soldier soldierWeapon = new Soldier(100,true,20,60,"Bow");//30 SOLDIER


        //Take one soldier as prototype, and clone it.Set only different features.
        Soldier soldier4 = soldierAvailable.clone();

        System.out.println("==============Prototype==============");
        soldierAvailable.printInfo();
        System.out.println("==============Clone=================");
        soldier4.printInfo();
        System.out.println("==============Clone SoldierNotAvailable=================");
        Soldier soldier5 = soldierAvailable.clone();
        soldier5.setAvailable(false);
        soldier5.printInfo();





    }
}

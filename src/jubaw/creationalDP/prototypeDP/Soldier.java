package jubaw.creationalDP.prototypeDP;

public class Soldier implements Cloneable {

    private int health;

    private int maxLifeTime;

    private int power;

    private String weapon;

    private boolean isAvailable;

    //param const
    public Soldier(int health, boolean isAvailable, int maxLifeTime, int power, String weapon) {
        this.health = health;
        this.isAvailable = isAvailable;
        this.maxLifeTime = maxLifeTime;
        this.power = power;
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Life Time: " + this.maxLifeTime);
        System.out.println("Health: " + this.health);
        System.out.println("Weapon: " + weapon);
        System.out.println("Power: " + power);
        if (isAvailable) {
            System.out.println("Soldier is ready to fight");
        } else {
            System.out.println("Soldier is not available to fight");
        }
    }


    @Override
    public Soldier clone() {
        try {
            Soldier cloneSoldier = (Soldier) super.clone();
            return cloneSoldier;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error while cloning soldier.");
            e.printStackTrace();
        }
        return null;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}

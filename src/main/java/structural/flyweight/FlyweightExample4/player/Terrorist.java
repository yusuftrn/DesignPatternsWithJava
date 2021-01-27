package structural.flyweight.FlyweightExample4.player;

public class Terrorist implements Player {
    //Intrinsic attribute
    private final String TASK;

    //Extrinsic attribute
    private String weapon;

    public Terrorist() {
        TASK = "PLANT a BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with " + weapon + " | " + "TASK is: " + TASK);
    }
}

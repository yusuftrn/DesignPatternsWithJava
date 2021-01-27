package structural.flyweight.FlyweightExample4.player;

public class CounterTerrorist implements Player {
    //Intrinsic attribute
    private final String TASK;

    //Extrinsic attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("CounterTerrorist with " + weapon + " | " + "TASK is: " + TASK);
    }
}

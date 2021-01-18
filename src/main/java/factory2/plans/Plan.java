package factory2.plans;

public abstract class Plan {

    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}

package structural.adapter.adapterExample1.round;

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public boolean isFit(RoundPeg peg){
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}

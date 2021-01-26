package structural.flyweight.FlyweightExample2.pieces;

public class JPiece implements Piece {

    private String label;

    public JPiece(){
        label = "J";
    }

    @Override
    public void create(String color, int speed, boolean irreversible) {
        System.out.println("Piece is: " + label + " Color: " + color + " Speed: " + speed + " isIrreversible: " + irreversible);
    }
}

package structural.flyweight.FlyweightExample2.pieces;

public class IPiece implements Piece {

    private String label;

    public IPiece(){
        label = "I";
    }

    @Override
    public void create(String color, int speed, boolean irreversible) {
        System.out.println("Piece is: " + label + " Color: " + color + " Speed: " + speed + " isIrreversible: " + irreversible);
    }
}

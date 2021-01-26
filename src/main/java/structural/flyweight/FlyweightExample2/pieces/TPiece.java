package structural.flyweight.FlyweightExample2.pieces;

public class TPiece implements Piece {

    private String label;

    public TPiece(){
        label = "T";
    }

    @Override
    public void create(String color, int speed, boolean irreversible) {
        System.out.println("Piece is: " + label + " Color: " + color + " Speed: " + speed + " isIrreversible: " + irreversible);
    }
}

package structural.flyweight.FlyweightExample2.piecefactory;

import structural.flyweight.FlyweightExample2.pieces.IPiece;
import structural.flyweight.FlyweightExample2.pieces.JPiece;
import structural.flyweight.FlyweightExample2.pieces.Piece;
import structural.flyweight.FlyweightExample2.pieces.TPiece;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {

    private static final Map<String, Piece> pieceMap = new HashMap();

    public static Piece getPiece(String pieceType){
        Piece piece = null;
        if(pieceMap.get(pieceType) != null){
            piece = pieceMap.get(pieceType);
        }
        else{
            if(pieceType.equalsIgnoreCase("I")){
                piece = new IPiece();
            }
            else if(pieceType.equalsIgnoreCase("T")){
                piece = new TPiece();
            }
            else if(pieceType.equalsIgnoreCase("J")){
                piece = new JPiece();
            }
            pieceMap.put(pieceType, piece);
        }
        return piece;
    }
}

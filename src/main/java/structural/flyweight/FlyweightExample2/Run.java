package structural.flyweight.FlyweightExample2;

import structural.flyweight.FlyweightExample2.piecefactory.PieceFactory;
import structural.flyweight.FlyweightExample2.pieces.Piece;

public class Run {
    public static void main(String[] args){
        Piece piece = null;
        for(int i=1; i<20; i++){
            int a = i%3;
            if(a==0){
                piece = PieceFactory.getPiece("I");
                piece.create("red", i*3, true);
            }
            else if(a==1){
                piece = PieceFactory.getPiece("J");
                piece.create("blue", i*3, false);
            }
            else if(a==2){
                piece = PieceFactory.getPiece("T");
                piece.create("green", i*4, true);
            }
        }
    }
}

/*
Piece is: J Color: blue Speed: 3 isIrreversible: false
Piece is: T Color: green Speed: 8 isIrreversible: true
Piece is: I Color: red Speed: 9 isIrreversible: true
Piece is: J Color: blue Speed: 12 isIrreversible: false
Piece is: T Color: green Speed: 20 isIrreversible: true
Piece is: I Color: red Speed: 18 isIrreversible: true
Piece is: J Color: blue Speed: 21 isIrreversible: false
Piece is: T Color: green Speed: 32 isIrreversible: true
Piece is: I Color: red Speed: 27 isIrreversible: true
Piece is: J Color: blue Speed: 30 isIrreversible: false
Piece is: T Color: green Speed: 44 isIrreversible: true
Piece is: I Color: red Speed: 36 isIrreversible: true
Piece is: J Color: blue Speed: 39 isIrreversible: false
Piece is: T Color: green Speed: 56 isIrreversible: true
Piece is: I Color: red Speed: 45 isIrreversible: true
Piece is: J Color: blue Speed: 48 isIrreversible: false
Piece is: T Color: green Speed: 68 isIrreversible: true
Piece is: I Color: red Speed: 54 isIrreversible: true
Piece is: J Color: blue Speed: 57 isIrreversible: false
 */
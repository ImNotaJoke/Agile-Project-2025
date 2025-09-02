package main.piece;

import main.Couleur;
import main.Plateau;

public class Dame extends Piece {
    public Dame(Couleur color) {
        super(color, PieceName.DAME);
    }

    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        return true;
    }
}

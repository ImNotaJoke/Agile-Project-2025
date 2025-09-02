package main.piece;

import main.Couleur;
import main.Plateau;

public class Dame extends Piece {
    public Dame(Couleur color) {
        super(color, PieceName.DAME);
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        return true;
    }
}

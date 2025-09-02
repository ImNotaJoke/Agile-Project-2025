package main.piece;

import main.Couleur;
import main.Plateau;

public class Rextends Piece {
    public Roi(Couleur color) {
        super(color, PieceName.ROI);
    }

    public boolean moveIsOk(Plateau plateau, int[] oldPosition, int[] newPosition) {
        return true;
    }
}

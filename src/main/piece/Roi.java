package main.piece;

import main.Couleur;
import main.Plateau;

public class Roi extends Piece {
    public Roi(Couleur color) {
        super(color, PieceName.ROI);
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        return true;
    }
}

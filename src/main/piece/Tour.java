package main.piece;

import main.Couleur;
import main.Plateau;

public class Tour extends Piece {
    public Tour(Couleur color) {
        super(color, PieceName.TOUR);
    }

    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        return (oldPosition[0] == newPosition[0] || oldPosition[1] == newPosition[1])
                && super.maxDepl(plateau, oldPosition, newPosition);
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        Piece[][] plat = plateau.getPlateau();
        if (moveIsOk(plat, oldPosition, newPosition)) {
            plat[newPosition[0]][newPosition[1]] = plat[oldPosition[0]][oldPosition[1]];
            plat[oldPosition[0]][oldPosition[1]] = null;
            plateau.setPlateau(plat);
            return true;
        }
        return false;
    }
}
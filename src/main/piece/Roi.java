package main.piece;

import main.Couleur;
import main.Plateau;

public class Roi extends Piece {
    public Roi(Couleur color) {
        super(color, PieceName.ROI);
    }

    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        if(newPosition[0] < 8 && newPosition[0] >= 0 && newPosition[1] < 8 && newPosition[1] >= 0) {
            if (Math.abs(oldPosition[0] - newPosition[0]) <= 1 && Math.abs(oldPosition[1] - newPosition[1]) <= 1 && plateau[newPosition[0]][newPosition[1]] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        if (moveIsOk(plateau.getPlateau(), oldPosition, newPosition)) {
            plateau.getPlateau()[newPosition[0]][newPosition[1]] = this;
            plateau.getPlateau()[oldPosition[0]][oldPosition[1]] = null;
            return true;
        }
        System.out.println("Mouvement impossible pour le roi");
        return false;
    }
}

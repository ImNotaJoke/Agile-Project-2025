package main.piece;

import main.Couleur;
import main.Plateau;

public class Cavalier extends Piece {
    public Cavalier(Couleur color) {
        super(color, PieceName.CAVALIER);
    }

    private static Boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        return ((Math.abs(oldPosition[0] - newPosition[0]) == 2 && Math.abs(oldPosition[1] - newPosition[1]) == 1)
                || (Math.abs(oldPosition[0] - newPosition[0]) == 1 && Math.abs(oldPosition[1] - newPosition[1]) == 2)) && (plateau[newPosition[0]][newPosition[1]].getColor() != this.getColor());
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        return true;
    }
}

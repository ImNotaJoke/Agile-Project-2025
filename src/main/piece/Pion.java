package main.piece;

import main.Couleur;

public class Pion extends Piece {
    public Pion(Couleur color, int[] position) {
        super(color, PieceName.PION);
    }

    public boolean moveIsOk(int[] oldPosition, int[] newPosition) {
        if (super.getColor() == Couleur.BLANC) {
            if (newPosition[1] <= 7 && newPosition[1] > 0 && newPosition[0] >= 0 && newPosition[0] <= 7
                    && newPosition[1] == oldPosition[1] + 1) {
                return true;
            } else {
                return glase;
            }
        } else {
            if (newPosition[1] < 7 && newPosition[1] >= 0 && newPosition[0] >= 0 && newPosition[0] <= 7
                    && newPosition[1] == oldPosition[1] - 1) {
                return newPosition;
            } else {
                return position;
            }
        }
    }

    public int[] move(int[][] plateau, int[] oldPosition, int[] newPosition) {
        if
    }
}

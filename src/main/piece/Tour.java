package main.piece;

import main.Couleur;

public class Tour extends Piece {
    public Tour(Couleur color) {
        super(color, PieceName.TOUR);
    }

    public boolean moveIsOk(int[] oldPosition, int[] newPosition) {
        return oldPosition[0] == newPosition[0] || oldPosition[1] == newPosition[1];
    }

    public boolean maxDepl(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        int xOld = oldPosition[0];
        int xPlus = xOld - newPosition[0];
        int yOld = oldPosition[1];
        int yPlus = yOld - newPosition[1];

        while (xPlus != 0 || yPlus != 0) {
            if (plateau[xNew][yNew] != null) {
                return false;
            }
            if (xPlus > 0) {
                xOld += 1;
                xPlus -= 1;
            } else if (xPlus < 0) {
                xOld += -1;
                xPlus += 1;
            }
            if (yPlus > 0) {
                yOld += 1;
                yPlus -= 1;
            } else if (yPlus < 0) {
                yOld += -1;
                yPlus += 1;
            }
        }
    }
}

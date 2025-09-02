package main.piece;

import main.Couleur;
import main.Plateau;

public class Cavalier extends Piece {
    public Cavalier(Couleur color) {
        super(color, PieceName.CAVALIER);
    }

    private static Boolean moveIsOk(int[][] plateau, int[] oldPosition, int) {
        return ((Math.abs(departLigne - arriveeligne) == 2 && Math.abs(departColonne - arriveColonne) == 1)
                || (Math.abs(departLigne - arriveeligne) == 1 && Math.abs(departColonne - arriveColonne) == 2));
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        return true;
    }

}

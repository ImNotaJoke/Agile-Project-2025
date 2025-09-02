package main.piece;

import main.Couleur;

public class Cavalier extends Piece {
    public Cavalier(Couleur color) {
        super(color, PieceName.CAVALIER);
    }

    private static Boolean chemin(int departLigne, int departColonne, int arriveeligne, int arriveColonne) {
        return ((Math.abs(departLigne - arriveeligne) == 2 && Math.abs(departColonne - arriveColonne) == 1)
                || (Math.abs(departLigne - arriveeligne) == 1 && Math.abs(departColonne - arriveColonne) == 2));
    }

}

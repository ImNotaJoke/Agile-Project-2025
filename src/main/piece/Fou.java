package main.piece;

import main.Couleur;

public class Fou extends Piece {
    public Fou(Couleur color) {
        super(color, PieceName.FOU);
    }

    private static Boolean chemin(int departLigne, int departColonne, int arriveeligne, int arriveColonne) {
        return ((Math.abs(departLigne - arriveeligne) == Math.abs(departColonne
                - arriveColonne)));
    }

}

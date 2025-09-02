
package main;

import main.piece.Piece;
import main.piece.Pion;
import main.piece.Dame;
import main.piece.Fou;
import main.piece.Cavalier;
import main.piece.Roi;
import main.piece.Tour;

public class ChessWithMe {
    public static void main(String[] args) {

        Plateau plateau = new Plateau();
        plateau.initPlateau();
        plateau.initPlateauCouleur();

        Piece p1 = new Pion(Couleur.NOIR);

        plateau.placerPiece(7, 5, p1);

        System.out.println(plateau);

        System.out.println(joueur);
        System.out.println(joueur2);

    }
}
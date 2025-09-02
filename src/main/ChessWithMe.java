
package main;

import main.piece.*;

public class ChessWithMe {
    public static void main(String[] args) {

        Plateau plateau = new Plateau();
        plateau.initPlateau();
        plateau.initPlateauCouleur();

        CreationJoueur joueur = new CreationJoueur("Bruno", Couleur.BLANC);
        CreationJoueur joueur2 = new CreationJoueur("Antoine", Couleur.NOIR);

        Piece p1 = new Pion(Couleur.NOIR, new int[] { 1, 1 });

        plateau.placerPiece(7, 5, p1);

        System.out.println(plateau);

        System.out.println(joueur);
        System.out.println(joueur2);

    }
}
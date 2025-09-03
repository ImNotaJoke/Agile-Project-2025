
package main;

import main.piece.*;

public class Mange {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        plateau.initPlateauVierge();
        plateau.placerPiece(0, 4, new Tour(Couleur.BLANC));
        System.out.println(plateau);
        plateau.placerPiece(4, 4, new Fou(Couleur.NOIR));
        System.out.println(plateau);
        plateau.getPlateau()[0][4].move(plateau, new int[] { 0, 4 }, new int[] { 4, 4 });
        System.out.println(plateau);
    }
}
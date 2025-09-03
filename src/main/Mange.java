
package main;

import main.piece.*;

public class Mange {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        plateau.initPlateauVierge();
        plateau.placerPiece(0, 4, new Tour(Couleur.BLANC));
        System.out.println(plateau);
        plateau.placerPiece(4, 4, new Roi(Couleur.NOIR));
        System.out.println(plateau);
        plateau.getRoi(Couleur.NOIR).echec(plateau.getPlateau(), plateau.getPositionRoi(Couleur.NOIR));
    }
}

package main;

import main.piece.*;

public class Echec {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        plateau.initPlateauVierge();
        plateau.placerPiece(0, 4, new Tour(Couleur.BLANC));
        plateau.placerPiece(0, 3, new Tour(Couleur.BLANC));
        plateau.placerPiece(0, 5, new Tour(Couleur.BLANC));
        plateau.placerPiece(3, 1, new Tour(Couleur.NOIR));
        plateau.placerPiece(4, 4, new Roi(Couleur.NOIR));
        //plateau.placerPiece(3, 1, new Fou(Couleur.NOIR));
        System.out.println(plateau);
        plateau.getRoi(Couleur.NOIR).echec(plateau.getPlateau(), plateau.getPositionRoi(Couleur.NOIR));
        plateau.getRoi(Couleur.NOIR).echecEtMat(plateau.getPlateau(), plateau.getPositionRoi(Couleur.NOIR));
    }
}
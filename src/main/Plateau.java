package main;

import main.piece.Cavalier;
import main.piece.Dame;
import main.piece.Fou;
import main.piece.Piece;
import main.piece.Pion;
import main.piece.Roi;
import main.piece.Tour;

public class Plateau {

    private Piece[][] plateau;
    private String[][] plateauCouleur;

    public Plateau() {
        this.plateau = new Piece[8][8];
        this.plateauCouleur = new String[8][8];
        this.initPlateauCouleur();
        this.initPlateau();
    }

    public void initPlateau() {
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                this.plateau[i][k] = null;
            }
        }
        for (int i = 0; i < 8; i++) {
            this.placerPiece(1, i, new Pion(Couleur.NOIR));
            this.placerPiece(6, i, new Pion(Couleur.BLANC));
        }
        this.placerPiece(0, 0, new Tour(Couleur.NOIR));
        this.placerPiece(0, 1, new Cavalier(Couleur.NOIR));
        this.placerPiece(0, 2, new Fou(Couleur.NOIR));
        this.placerPiece(0, 3, new Dame(Couleur.NOIR));
        this.placerPiece(0, 4, new Roi(Couleur.NOIR));
        this.placerPiece(0, 5, new Fou(Couleur.NOIR));
        this.placerPiece(0, 6, new Cavalier(Couleur.NOIR));
        this.placerPiece(0, 7, new Tour(Couleur.NOIR));

        this.placerPiece(7, 0, new Tour(Couleur.BLANC));
        this.placerPiece(7, 1, new Cavalier(Couleur.BLANC));
        this.placerPiece(7, 2, new Fou(Couleur.BLANC));
        this.placerPiece(7, 3, new Dame(Couleur.BLANC));
        this.placerPiece(7, 4, new Roi(Couleur.BLANC));
        this.placerPiece(7, 5, new Fou(Couleur.BLANC));
        this.placerPiece(7, 6, new Cavalier(Couleur.BLANC));
        this.placerPiece(7, 7, new Tour(Couleur.BLANC));
    }

    public void initPlateauVierge() {
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                this.plateau[i][k] = null;
            }
        }
    }

    public void initPlateauCouleur() {
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                if ((i + k) % 2 == 0) {
                    this.plateauCouleur[i][k] = "⬛";
                } else {
                    this.plateauCouleur[i][k] = "⬜";
                }
            }
        }
    }

    @Override
    public String toString() {
        String s = "  a b c d e f g h  ";
        s += "\n";
        for (int i = 0; i < 8; i++) {
            s += i+1 + " ";
            for (int k = 0; k < 8; k++) {
                if (plateau[i][k] == null) {
                    s += plateauCouleur[i][k];
                } else {
                    s += plateau[i][k].getPiece() + " ";
                }
            }
            s += " " + (i+1);
            s += "\n";
        }
        s += "  a b c d e f g h  ";
        return s;
    }

    public void placerPiece(int i, int k, Piece piece) {
        this.plateau[i][k] = piece;
    }

    public Piece[][] getPlateau() {
        return plateau;
    }

    public void setPlateau(Piece[][] plateau) {
        this.plateau = plateau;
    }

    public String[][] getPlateauCouleur() {
        return plateauCouleur;
    }

    public void setPlateauCouleur(String[][] plateauCouleur) {
        this.plateauCouleur = plateauCouleur;
    }

    public Roi getRoi(Couleur color) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece = plateau[i][j];
                if (piece != null && piece.getName() == main.piece.PieceName.ROI && piece.getColor() == color) {
                    return (Roi) piece;
                }
            }
        }
        return null; // Roi non trouvé
    }
}
package main.piece;

import main.Couleur;
import main.Plateau;

public class Pion extends Piece {
    public Pion(Couleur color) {
        super(color, PieceName.PION);
    }

    public boolean pionMange(boolean estBlanc, Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        int oldX = oldPosition[0];
        int oldY = oldPosition[1];
        int newX = newPosition[0];
        int newY = newPosition[1];

        // Vérifie que la nouvelle position est bien sur le plateau
        if (newX < 0 || newX > 7 || newY < 0 || newY > 7) {
            return false;
        }

        // Mouvement du pion blanc (avance vers le bas de la matrice si [0][0] est en
        // haut à gauche)
        if (estBlanc) {
            if (newX == oldX + 1 && Math.abs(newY - oldY) == 1) {
                Piece cible = plateau[newX][newY];
                return (cible != null && cible.getColor() != Couleur.BLANC);
            }
        }
        // Mouvement du pion noir (avance vers le haut de la matrice)
        else {
            if (newX == oldX - 1 && Math.abs(newY - oldY) == 1) {
                Piece cible = plateau[newX][newY];
                return (cible != null && cible.getColor() != Couleur.NOIR);
            }
        }
        return false;
    }

    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        boolean estBlanc = super.getColor() == Couleur.BLANC;
        if (estBlanc) {
            if (plateau[oldPosition[0] - 1][oldPosition[1]] == null) {
                if (newPosition[0] >= 0 && newPosition[0] <= 7 && newPosition[0] == oldPosition[0] - 1
                        && newPosition[1] == oldPosition[1]) {
                    return true;
                }
            }
        } else {
            if (plateau[oldPosition[0] + 1][oldPosition[1]] == null) {
                if (newPosition[0] >= 0 && newPosition[0] <= 7 && newPosition[0] == oldPosition[0] + 1
                        && newPosition[1] == oldPosition[1]) {
                    return true;
                }
            }
        }
        return pionMange(estBlanc, plateau, oldPosition, newPosition);
    }

    public boolean promotion(Plateau plateau, int[] position) {
        Piece[][] plat = plateau.getPlateau();
        Couleur couleur = plat[position[0]][position[1]].getColor();
        if(position[0] == 0 || position[0] == 7){
            System.out.println("Promotion du pion en dame");
            plat[position[0]][position[1]] = new Dame(couleur);
            plateau.setPlateau(plat);
            return true;
        }
        return false;
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        Piece[][] plat = plateau.getPlateau();
        if (this.moveIsOk(plat, oldPosition, newPosition)) {
            plat[newPosition[0]][newPosition[1]] = this;
            plat[oldPosition[0]][oldPosition[1]] = null;
            plateau.setPlateau(plat);
            this.promotion(plateau, newPosition);
            return true;
        } else {
            System.out.println("Mouvement impossible pour le pion");
            return false;
        }
    }
}
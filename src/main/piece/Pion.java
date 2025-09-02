package main.piece;

import main.Couleur;

public class Pion extends Piece {
    public Pion(Couleur color) {
        super(color, PieceName.PION);
    }

    public boolean pionMange(boolean estBlanc, Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        if (estBlanc) {
            if(newPosition[0] == oldPosition[0]+1)
            plateau[][]
        }
    }

    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        boolean estBlanc = super.getColor() == Couleur.BLANC;
        if (estBlanc) {
            if (plateau[oldPosition[0] + 1][oldPosition[1]] == null) {
                if (newPosition[1] <= 7 && newPosition[1] >= 0 && newPosition[0] >= 0 && newPosition[0] <= 7
                        && newPosition[0] == oldPosition[0] + 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            if (plateau[oldPosition[0] - 1][oldPosition[1] - 1] == null) {
                if (newPosition[1] =< 7 && newPosition[1] >= 0 && newPosition[0] >= 0 && newPosition[0] <= 7
                        && newPosition[0] == oldPosition[0] - 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public Piece[][] move(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        if (this.moveIsOk(plateau, oldPosition, newPosition)) {
            plateau[newPosition[0]][newPosition[1]] = plateau[oldPosition[0]][oldPosition[1]];
            plateau[oldPosition[0]][oldPosition[1]] = null;
            return plateau;
        } else {
            System.out.println("Mouvement impossible pour le pion");
            return null;
        }
    }

}
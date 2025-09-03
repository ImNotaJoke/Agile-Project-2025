package main.piece;

import main.Couleur;
import main.Plateau;

public abstract class Piece {
    Couleur color;
    PieceName name;

    public Piece(Couleur color, PieceName name) {
        this.color = color;
        this.name = name;
    }

    public Couleur getColor() {
        return this.color;
    }

    public String getPiece() {
        switch (this.name) {
            case PION:
                return this.color == Couleur.BLANC ? "♙" : "♟";
            case TOUR:
                return this.color == Couleur.BLANC ? "♖" : "♜";
            case CAVALIER:
                return this.color == Couleur.BLANC ? "♘" : "♞";
            case FOU:
                return this.color == Couleur.BLANC ? "♗" : "♝";
            case DAME:
                return this.color == Couleur.BLANC ? "♕" : "♛";
            case ROI:
                return this.color == Couleur.BLANC ? "♔" : "♚";
            default:
                return " ";
        }
    }

    public boolean mange(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        int xOld = oldPosition[0];
        int xPlus = xOld - newPosition[0];
        int yOld = oldPosition[1];
        int yPlus = yOld - newPosition[1];

        while (xPlus != 0 || yPlus != 0) {
            if (xPlus > 0) {
                xOld -= 1;
                xPlus -= 1;
            } else if (xPlus < 0) {
                xOld += 1;
                xPlus += 1;
            }
            if (yPlus > 0) {
                yOld -= 1;
                yPlus -= 1;
            } else if (yPlus < 0) {
                yOld += 1;
                yPlus += 1;
            }
            if (plateau[xOld][yOld] != null) {
                if(xOld == newPosition[0] && yOld == newPosition[1]){
                    return plateau[xOld][yOld].getColor() != this.color;
                }
                return false;
            }
        }
        return true;
    }

    public boolean maxDepl(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        int xOld = oldPosition[0];
        int xPlus = xOld - newPosition[0];
        int yOld = oldPosition[1];
        int yPlus = yOld - newPosition[1];

        while (xPlus != 0 || yPlus != 0) {
            if (xPlus > 0) {
                xOld -= 1;
                xPlus -= 1;
            } else if (xPlus < 0) {
                xOld += 1;
                xPlus += 1;
            }
            if (yPlus > 0) {
                yOld -= 1;
                yPlus -= 1;
            } else if (yPlus < 0) {
                yOld += 1;
                yPlus += 1;
            }
            if (plateau[xOld][yOld] != null) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean move(Plateau plateau, int[] oldPosition, int[] newPosition);

}
package main.piece;

import main.Couleur;
import main.Plateau;
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
        if (this.color == Couleur.BLANC) {
            if (this.name == PieceName.PION) {
                return "♟";
            } else if (this.name == PieceName.TOUR) {
                return "♜";
            } else if (this.name == PieceName.CAVALIER) {
                return "♞";
            } else if (this.name == PieceName.FOU) {
                return "♝";
            } else if (this.name == PieceName.DAME) {
                return "♛";
            } else {
                return "♚";
            }
        } else {
            if (this.name == PieceName.TOUR) {
                return "♖";
            } else if (this.name == PieceName.CAVALIER) {
                return "♘";
            } else if (this.name == PieceName.FOU) {
                return "♗";
            } else if (this.name == PieceName.DAME) {
                return "♕";
            } else {
                return "♔";
            }
        }
    }

    public boolean maxDepl(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        int xOld = oldPosition[0];
        int xPlus = xOld - newPosition[0];
        int yOld = oldPosition[1];
        int yPlus = yOld - newPosition[1];

        while (xPlus != 0 || yPlus != 0) {
            if (plateau[xOld][yOld] != null) {
                return false;
            }
            if (xPlus > 0) {
                xOld += 1;
                xPlus -= 1;
            } else if (xPlus < 0) {
                xOld += -1;
                xPlus += 1;
            }
            if (yPlus > 0) {
                yOld += 1;
                yPlus -= 1;
            } else if (yPlus < 0) {
                yOld += -1;
                yPlus += 1;
            }
        }
        return true;
    }

    public abstract boolean move(Plateau plateau, int[] oldPosition, int[] newPosition);

}
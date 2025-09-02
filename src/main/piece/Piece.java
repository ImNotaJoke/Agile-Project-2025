package main.piece;

import main.Couleur;

public class Piece {
    Couleur color;
    PieceName name;
    int[] position;

    public Piece(Couleur color, PieceName name) {
        this.color = color;
        this.name = name;
    }

    public Couleur getColor() {
        return this.color;
    }

    public String getPiece() {
        if (this.color == Couleur.NOIR) {
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
            if (this.name == PieceName.PION) {
                return "♙";
            } else if (this.name == PieceName.TOUR) {
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

    public int[] getPosition() {
        return this.position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
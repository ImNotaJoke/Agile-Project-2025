package main.piece;

import main.Couleur;

public class Piece {
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
}
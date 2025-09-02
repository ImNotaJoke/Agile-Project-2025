
package main;

import main.piece.Piece;

public class ChessWithMe {
    public static void main(String[] args) {

        Plateau plateau = new Plateau();

        plateau.getPlateau()[1][0].move(plateau,new int[]{1,0},new int[]{2,0});

        }

    System.out.println(plateau);
}}
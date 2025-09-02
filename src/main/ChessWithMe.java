
package main;

import java.util.Scanner;

import main.piece.Piece;

public class ChessWithMe {
    public static void main(String[] args) {
        Joueur joueur1;
        Joueur joueur2;

        Plateau plateau = new Plateau();

        plateau.getPlateau()[1][0].move(plateau, new int[] { 1, 0 }, new int[] { 2, 0 });

        System.out.println(plateau);

        Scanner rep = new Scanner(System.in);
        System.out.println(("Entrez votre pseudo: "));
        String nom = rep.nextLine();
        Joueur j1 = new Joueur (nom)
    }
}
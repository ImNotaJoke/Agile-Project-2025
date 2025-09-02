
package main;

import java.util.Scanner;

import main.piece.Piece;

public class ChessWithMe {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Joueur joueur1;
        // Joueur joueur2;
=======
        Joueur joueur1;
        Joueur joueur2;
        String nom;
        nom = "ChessWithMe";

        joueur1 = new Joueur("Joueur 1");
        joueur2 = new Joueur("Joueur 2");
>>>>>>> f0cea11d0a4921c83ea0e72e22302b5ee198115b

        Plateau plateau = new Plateau();

        plateau.getPlateau()[1][0].move(plateau, new int[] { 1, 0 }, new int[] { 2, 0 });
        System.out.println(plateau);
        plateau.getPlateau()[2][0].move(plateau, new int[] { 2, 0 }, new int[] { 3, 0 });
        System.out.println(plateau);
        plateau.getPlateau()[0][0].move(plateau, new int[] { 0, 0 }, new int[] { 2, 0 });
        System.out.println(plateau);

        // System.out.println(nom + "\n");
        // Couleur couleur = Couleur.demandeCouleur();
        // joueur1.setCouleur(couleur);
        // if (couleur == Couleur.NOIR) {
        //     joueur2.setCouleur(Couleur.BLANC);
        // } else {
        //     joueur2.setCouleur(Couleur.NOIR);
        // }

        Scanner sc = new Scanner(System.in); 
        System.out.println("Joueur 1 : entrez votre pseudo : ");
        String nom = sc.nextLine(); 
        Couleur couleur = Couleur.demandeCouleur();
        Joueur j1 = new Joueur(nom,couleur); 
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("Joueur 2 : entrez votre pseudo : ");
        String nom2 = sc2.nextLine(); 
        Joueur j2 ; 
        if ( j1.getCouleur == Couleur.BLANC)



    }

    // public void choixPseudo() {

    //     Joueur joueur1;
    //     Joueur joueur2;
    //     Scanner rep = new Scanner(System.in);
    //     System.out.println(" Joueur 1 :Entrez votre pseudo: ");
    //     String nom = rep.nextLine();
    //     joueur1 = new Joueur(nom);
    //     Scanner rep2 = new Scanner(System.in);
    //     System.out.println("Joueur 2 : Entrez votre pseudo: ");
    //     String nomj2 = rep2.nextLine();
    //     joueur2 = new Joueur(nomj2);
    // }

}
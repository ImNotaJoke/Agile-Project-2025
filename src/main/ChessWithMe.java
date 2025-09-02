
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessWithMe {
    public static void main(String[] args) {

        //Choix Nom et couleur
        Scanner sc = new Scanner(System.in); 
        System.out.println("Joueur 1 : entrez votre pseudo : ");
        String nom = sc.nextLine(); 
        Couleur couleur = Couleur.demandeCouleur();
        Joueur j1 = new Joueur(nom,couleur); //crée un joueur 1 avec couleur et pseudo 
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("Joueur 2 : entrez votre pseudo : ");
        String nom2 = sc2.nextLine(); 
        Joueur j2 = new Joueur(nom2); // crée le joueur 2 seulement avec le pseudo 
        if ( j1.getCouleur() == Couleur.BLANC){// se base sur le choix de la couleur du joueur 1 pour donner une nouvelle couleur au joueur 2  
        sc2.close();
        }
        if ( j1.getCouleur() == Couleur.BLANC){
            j2.setCouleur(Couleur.NOIR); 
        }else{
            j2.setCouleur(Couleur.BLANC); 
        }
        System.out.println("Joueur 1 : " + j1.getPseudo() + " (" + j1.getCouleur() + ")");
        System.out.println("Joueur 2 : " + j2.getPseudo() + " (" + j2.getCouleur() + ")");

        Plateau plateau = new Plateau();

        plateau.getPlateau()[1][0].move(plateau, new int[] { 1, 0 }, new int[] { 2, 0 });
        System.out.println(plateau);
        plateau.getPlateau()[2][0].move(plateau, new int[] { 2, 0 }, new int[] { 3, 0 });
        System.out.println(plateau);
        plateau.getPlateau()[0][0].move(plateau, new int[] { 0, 0 }, new int[] { 2, 0 });
        System.out.println(plateau);
    }
}
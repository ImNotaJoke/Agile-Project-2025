
package main;

import main.piece.*;

public class ChessWithMe {
    public static void main(String[] args) {

        Plateau plateau = new Plateau();
        plateau.initPlateau();
        plateau.initPlateauCouleur();


        Joueur joueur = new Joueur("Bruno", Couleur.BLANC); 
        Joueur joueur2 = new Joueur("Antoine", Couleur.NOIR);
        

        System.out.println(plateau);

        System.out.println(joueur);
        System.out.println(joueur2);
        
    }
}
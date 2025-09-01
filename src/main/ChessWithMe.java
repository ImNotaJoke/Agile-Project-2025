package main;

public class ChessWithMe{
    public static void main(String[] args){
        
        Plateau plateau = new Plateau();
        plateau.initPlateau();
        plateau.initPlateauCouleur();


        CreationJoueur joueur = new CreationJoueur("Bruno", Couleur.BLANC); 
        CreationJoueur joueur2 = new CreationJoueur("Antoine", Couleur.NOIR);
        

        System.out.println(plateau);

        System.out.println(joueur);
        System.out.println(joueur2);
        
    }
}
package main;

public class ChessWithMe{
    public static void main(String[] args){
        
        Plateau plateau = new Plateau();
        plateau.initPlateau();
        plateau.initPlateauCouleur();

        System.out.println(plateau);

        Joueur j1 =  new Joueur("bruno", Couleur.BLANC); 
        Joueur j2 = new Joueur("truc ", Couleur.NOIR); 

        System.out.println(j1);
        System.out.println(j2);
        
    }
}
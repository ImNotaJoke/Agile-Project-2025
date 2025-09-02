package main;

public class Chess{
    public static void main(String[] args) {
        Plateau plateau = new Plateau();

        plateau.getPlateau()[1][0].move(plateau, new int[] { 1, 0 }, new int[] { 2, 0 });
        System.out.println(plateau);

        Joueur j1 = new Joueur("a",Couleur.NOIR);
        j1.demanderDeplacement(plateau);
        System.out.println(plateau);
    }
}
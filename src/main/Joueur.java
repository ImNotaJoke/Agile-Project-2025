package main;

import java.util.Scanner;
public class Joueur {
    /* Attributs */
    private String pseudo;
    private Couleur couleur;

    /* Constructeurs */
    public Joueur(String pseudo, Couleur coul) {
        this.pseudo = pseudo;
        this.couleur = coul;
    }

    public Joueur(String pseudo) {
        this.pseudo = pseudo;
    }

    /* Getter */
    public String getPseudo() {
        return this.pseudo;
    }

    public Couleur getCouleur() {
        return this.couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    /* Methodes */
    @Override
    public String toString() {
        return " " + this.pseudo + " : " + this.getCouleur();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Joueur others = (Joueur) obj;
        if (this.pseudo != others.pseudo) {
            return false;
        }
        return true;
    }

    public int[] transformerCo(String co){
        int[] tabCo = new int[2];
        if(Character.toLowerCase(co.charAt(0)) >= 'a' && Character.toLowerCase(co.charAt(0)) <= 'h'){
            tabCo[1] = Character.toLowerCase(co.charAt(0)) - 'a';
            if(co.charAt(1) - '0' >= 1 && co.charAt(1) - '7' <= 8){
                tabCo[0] = co.charAt(1) - '0' - 1;
                return tabCo;
            }
        }
        return null;
    }

    public void demanderDeplacement(Plateau plateau){
        String co1 = "";
        String co2 = "";
        int[] co1tab;
        int[] co2tab;

        Scanner sc = new Scanner(System.in); 
        System.out.println(this.pseudo + " quel piece veux tu bouger ?");
        co1 = sc.nextLine();
        co1tab = transformerCo(co1);

        System.out.println(this.pseudo + " où veux tu la bouger ?");
        co2 = sc.nextLine();
        co2tab = transformerCo(co2);
        sc.close();
        
        plateau.getPlateau()[co1tab[0]][co1tab[1]].move(plateau,co1tab,co2tab);
    }
}

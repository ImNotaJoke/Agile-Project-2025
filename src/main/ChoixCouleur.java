package main;

import java.util.Scanner;

public class ChoixCouleur {
    // la couleur est un int, 1 pour les blanc et 2 pour les noirs
    private Couleur couleur;

    // Fais appelle à la classe enum qui contient blanc ou noir 
    public ChoixCouleur(Couleur couleur){
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public static ChoixCouleur demandeCouleur(){
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while (choix != 1 && choix != 2) {
            System.out.println("Choisissez votre couleur :");
            System.out.println("1 - Blanc");
            System.out.println("2 - Noir");
            System.out.print("Votre choix : ");
            
            if (sc.hasNextInt()) {
                choix = sc.nextInt();
            } else {
                sc.next();
            }

            if (choix != 1 && choix != 2) {
                System.out.println("Choix invalide, veuillez entrer 1 ou 2.");
            }
        }

        Couleur couleurChoisie;

        if(choix == 1 ){
            couleurChoisie = Couleur.BLANC;
        }
        else{
            couleurChoisie = Couleur.NOIR;
        }
        return new ChoixCouleur(couleurChoisie);
    }
}

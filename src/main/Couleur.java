package main;

import java.util.Scanner;

public enum Couleur {
    BLANC, NOIR;

    public static Couleur demandeCouleur() {
        Scanner sc = new Scanner(System.in);
        String saisie;

        while (true) {
            System.out.println("Choisissez votre couleur :");
            System.out.println("1 - Blanc");
            System.out.println("2 - Noir");
            System.out.print("Votre choix : ");

            saisie = sc.nextLine().trim();

            if (saisie.isEmpty()) {
                System.out.println("Veuillez entrer 1 ou 2.");
                continue;
            }

            if (saisie.equals("1")) {
                return Couleur.BLANC;
            } else if (saisie.equals("2")) {
                return Couleur.NOIR;
            } else {
                System.out.println("Choix invalide, veuillez entrer 1 ou 2.");
            }
        }
    }
}
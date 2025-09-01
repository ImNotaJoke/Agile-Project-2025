package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        boolean quitter = false;

        while (!quitter) {
            afficherMenu();
            try {
                System.out.print("Votre choix : ");
                int choix = menu.nextInt();
                menu.nextLine(); // Vider le buffer après nextInt

                switch (choix) {
                    case 1:
                        afficherJouer(menu); // RESTE dans le sous-menu jusqu’à retour
                        break;
                    case 2:
                        afficherHistorique(menu); // RESTE jusqu’à retour
                        break;
                    case 3:
                        afficherCredits(menu); // RESTE jusqu’à retour
                        break;
                    case 4:
                        quitter = true;
                        System.out.println("\n                            Au revoir !\n");
                        break;
                    default:
                        System.out.println("     Choix invalide. Veuillez réessayer.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("     Entrée invalide. Veuillez entrer un nombre.\n");
                menu.nextLine(); // Vider l’entrée incorrecte
            }
        }

        menu.close();
    }

    public static void afficherMenu() {
        System.out.println("\n\n                            Bienvenue sur ChessWithMe !");
        System.out.println("                                 1. Jouer");
        System.out.println("                                 2. Historique");
        System.out.println("                                 3. Crédits");
        System.out.println("                                 4. Quitter");
        System.out.println();
    }

    public static void afficherJouer(Scanner scanner) {
        boolean retour = false;

        while (!retour) {
            System.out.println("\n\n                            Menu de Jeu");
            System.out.println("                                 1. vs Adversaire");
            System.out.println("                                 2. vs Ordinateur");
            System.out.println("                                 3. Retour au menu principal\n");

            try {
                System.out.print("Votre choix : ");
                int choix = scanner.nextInt();
                scanner.nextLine(); // vider le buffer

                switch (choix) {
                    case 1:
                        System.out.println("Démarrage de la partie contre un autre joueur...\n");
                        // Ajouter ici le lancement réel de la partie si nécessaire
                        break;
                    case 2:
                        System.out.println("Démarrage de la partie contre l'ordinateur...\n");
                        // Ajouter ici le lancement réel de la partie si nécessaire
                        break;
                    case 3:
                        retour = true;
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.\n");
                scanner.nextLine(); // vider l’entrée incorrecte
            }
        }
    }

    public static void afficherHistorique(Scanner scanner) {
        System.out.println("\n                           Historique");
        System.out.println("Aucune partie enregistrée pour le moment.\n");

        System.out.println("Appuyez sur Entrée pour revenir au menu principal...");
        scanner.nextLine();
    }

    public static void afficherCredits(Scanner scanner) {
        System.out.println("\n\n                            Crédits");
        System.out.println("   Réalisé par :");
        System.out.println("   - Nom 1");
        System.out.println("   - Nom 2");
        System.out.println("   - Nom 3");
        System.out.println("   - Nom 4");
        System.out.println("   - Nom 5\n");

        System.out.println("Appuyez sur Entrée pour revenir au menu principal...");
        scanner.nextLine();
    }
}

package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        boolean quitter = false;    

        while (!quitter) {
            afficherTitre();
            afficherMenu();
            try {
                System.out.print("Votre choix : ");
                int choix = menu.nextInt();
                menu.nextLine();

                switch (choix) {
                    case 1:
                        afficherJouer(menu); 
                        break;
                    case 2:
                        afficherHistorique(menu);
                        break;
                    case 3:
                        afficherCredits(menu);
                        break;
                    case 4:
                        quitter = true;
                        afficherAuRevoirASCII();
                        break;
                    default:
                        System.out.println("\n     Choix invalide. Veuillez réessayer.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n     Entrée invalide. Veuillez entrer un nombre.\n");
                menu.nextLine(); // Vider l’entrée incorrecte
            }
        }

        menu.close();
    }

    // Affiche les choix du menu principal
    public static void afficherMenu() {
        System.out.println("\n\n                       1. Jouer");
        System.out.println("                       2. Historique");
        System.out.println("                       3. Crédits");
        System.out.println("                       4. Quitter");
        System.out.println();
    }

    // Affiche le sous-menu pour choisir le type d'adversaire
    public static void afficherJouer(Scanner scanner) {
        boolean retour = false;


        while (!retour) {
            afficherChoisirAdversaireASCII();
            System.out.println("\n\n                                 1. vs Adversaire");
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
                        System.out.println("En cours de création...\n");
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

    // Affiche l'historique des parties
    public static void afficherHistorique(Scanner scanner) {
        afficherHistoriqueAscii();
        System.out.println("Aucune partie enregistrée pour le moment.\n");

        System.out.println("Appuyez sur Entrée pour revenir au menu principal...");
        scanner.nextLine();
    }

    // Affiche les crédits du jeu
    public static void afficherCredits(Scanner scanner) {
        afficherCreditsAscii();
        System.out.println("   Réalisé par :\n");
        System.out.println("   - Sulivan");
        System.out.println("   - Camille");
        System.out.println("   - Manon");
        System.out.println("   - Nathan");
        System.out.println("   - Valentin\n");

        System.out.println("Appuyez sur Entrée pour revenir au menu principal...");
        scanner.nextLine();
    }

    // Affiche le titre du jeu en ASCII
    public static void afficherTitre() {
        System.out.println("   ____ _                    __        __  _   _       __  __      ");
        System.out.println("  / ___| |__   ___  ___ ___  \\ \\      / (_) |_| |__   |  \\/  | ___ ");
        System.out.println(" | |   | '_ \\ / _ \\/ __/ __|  \\ \\ /\\ / /| | __| '_ \\  | |\\/| |/ _ \\");
        System.out.println(" | |___| | | |  __/\\__ \\__ \\   \\ V  V / | | |_| | | | | |  | |  __/");
        System.out.println("  \\____|_| |_|\\___||___/___/    \\_/\\_/  |_|\\__|_| |_| |_|  |_|\\___|");
        System.out.println("                                                                    ");
    }

    // Affiche "Crédits" en ASCII
    public static void afficherCreditsAscii() {
        System.out.println("   ____       __     _   _       ");
        System.out.println("  / ___|_ __ /_/  __| (_) |_ ___ ");
        System.out.println(" | |   | '__/ _ \\/ _` | | __/ __|");
        System.out.println(" | |___| | |  __/ (_| | | |_\\__ \\");
        System.out.println("  \\____|_|  \\___|\\__,_|_|\\__|___/");
        System.out.println("                                   ");
    }

    // Affiche "Historique" en ASCII
    public static void afficherHistoriqueAscii() {
        System.out.println("  _   _ _     _                           ");
        System.out.println(" | | | (_)___| |_ ___  _ __(_) __ _ _   _  ___");
        System.out.println(" | |_| | / __| __/ _ \\| '__| |/ _` | | | |/ _ \'");
        System.out.println(" |  _  | \\__ \\ || (_) | |  | | (_| | |_| |  __/");
        System.out.println(" |_| |_|_|___/\\__\\___/|_|  |_|\\__, |\\__,_|\\___|");
        System.out.println("                                |_|       ");
    }

    // Affiche "Au revoir" en ASCII
    public static void afficherAuRevoirASCII() {
    System.out.println("     _                                      ");
    System.out.println("    / \\  _   _   _ __ _____   _____ (_)_ __  ");
    System.out.println("   / _ \\| | | | | '__/ _ \\ \\ / / _ \\| | '__|");
    System.out.println("  / ___ \\ |_| | | | |  __/\\ V / (_) | | |    ");
    System.out.println(" /_/   \\_\\__,_| |_|  \\___| \\_/ \\___/|_|_|    ");
    System.out.println("                                             ");
    }

    public static void afficherChoisirAdversaireASCII() {
    System.out.println("   ____ _                          _ _           _                                    ");
    System.out.println("  / ___| |__   ___ (_)___(_)_ __  | ( ) __ _  __| |_   _____ _ __ ___  __ _(_)_ __ ___ ");
    System.out.println(" | |   | '_ \\ / _ \\| / __| | '__| | |/ / _` |/ _` \\ \\ / / _ \\ '__/ __|/ _` | | '__/ _ \\");
    System.out.println(" | |___| | | | (_) | \\__ \\ | |    | | | (_| | (_| |\\ V /  __/ |  \\__ \\ (_| | | | |  __/");
    System.out.println("  \\____|_| |_|\\___/|_|___/_|_|    |_|  \\__,_|\\__,_| \\_/ \\___|_|  |___/\\__,_|_|_|  \\___|");
    System.out.println("                                                                                       ");
}

}

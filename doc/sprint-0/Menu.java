import java.util.Scanner;
public class Menu{

    public static void main(String[] args) {
        afficherMenu();
        Scanner menu = new Scanner(System.in);

        int choix = menu.nextInt();
        
        if (choix == 1) {
            afficherJouer();
        } else if (choix == 2) {
            afficherHistorique();
        } else if (choix == 3) {
            afficherCredits();
        } else if (choix == 4) {
            System.out.println("\n                            Au revoir !\n\n");
        } else {
            System.out.println("     Choix invalide. Veuillez réessayer.");
        }
        menu.close();
    }

    public static void afficherMenu(){
        System.out.println("\n\n                            Bienvenue sur ChessWithMe !\n\n                                 1. Jouer\n                                 2. Historique\n                                 3. Crédits\n                                 4. Quitter");
        System.out.print("\n\nVeuillez choisir une option :   [1/2/3/4] \n\n");
    }

    public static void afficherHistorique(){
        System.out.println("Historique !");
    }

    public static void afficherJouer(){
        System.out.println("\n\n                            Vous avez choisi de jouer !\n\n   1. vs Adversaire\n   2. vs Ordinateur");
    }

    public static void afficherCredits(){
        System.out.println("\n\n                            Crédits\n\n   Réalisé par :\n   - \n   - \n   - \n   - \n   - \n   - \n\n");
    }
}
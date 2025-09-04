package main;

import java.util.Scanner;

import main.piece.Roi;


public class ChessWithMe {
    public static void start(Demo type) {
        Joueur j1;
        Joueur j2;
        boolean readyj1 = true;
        boolean readyj2 = true;
        
        clearConsole();

        //Choix Nom et couleur
        Scanner sc = new Scanner(System.in); 
        System.out.println("Joueur 1 : entrez votre pseudo : ");
        String nom = sc.nextLine();
        clearConsole();
        Couleur couleur = Couleur.demandeCouleur();
        j1 = new Joueur(nom,couleur); //crée un joueur 1 avec couleur et pseudo
        clearConsole();
        Scanner sc2 = new Scanner(System.in); 
        clearConsole();
        System.out.println("Joueur 2 : entrez votre pseudo : ");
        String nom2 = sc2.nextLine(); 
        j2 = new Joueur(nom2); // crée le joueur 2 seulement avec le pseudo 
        if ( j1.getCouleur() == Couleur.BLANC){// se base sur le choix de la couleur du joueur 1 pour donner une nouvelle couleur au joueur 2 
            j2.setCouleur(Couleur.NOIR); 
        }else{
            j2.setCouleur(Couleur.BLANC); 
        }

        Plateau plateau = new Plateau(type);
        
        clearConsole();
        Menu.afficherTitre();
        System.out.println(plateau);
        j1.echecJoueur(plateau);
        j2.echecJoueur(plateau);

        Joueur blanc;
        Joueur noir;

        if ( j1.getCouleur() == Couleur.BLANC){
            blanc = j1;
            noir = j2;
        }else{
            blanc = j2;
            noir = j1;
        }

        do{
            do {
                blanc.echecJoueur(plateau);
                int [] co1 = blanc.choixDeplacement(blanc.getPseudo() + " choisie une pièce à déplacer (ex: a2 ou 2a) (Joueur " + j1.getCouleur() + "):");
                if(co1[0] == -1 && co1[1] == -1){
                    start(type);
                    return;
                }
                clearConsole();
                Menu.afficherTitre();
                System.out.println(plateau);
                int [] co2 = blanc.choixDeplacement(blanc.getPseudo() + " où voux tu bouger la pièce ? (ex: a2 ou 2a): ");
                readyj1 = !blanc.demanderDeplacement(plateau,co1,co2);
                Menu.afficherTitre();
                System.out.println(plateau);
            } while (readyj1);

            wait(1000);

            do {
                noir.echecJoueur(plateau);
                int [] co3 = noir.choixDeplacement(noir.getPseudo() + " choisie une pièce à déplacer (ex: a2 ou 2a) (Joueur " + j2.getCouleur() + "):");
                if(co3[0] == -1 && co3[1] == -1){
                    start(type);
                    return;
                }
                clearConsole();
                Menu.afficherTitre();
                System.out.println(plateau);
                int [] co4 = noir.choixDeplacement(noir.getPseudo() + " où voux tu bouger la pièce ? (ex: a2 ou 2a): ");
                readyj2 = !noir.demanderDeplacement(plateau,co3,co4);
                Menu.afficherTitre();
                System.out.println(plateau);
            } while (readyj2);
            
            readyj1 = false;
            readyj2 = false;
        }while(true);
    }

   public static void startBot(Demo type) {
    Scanner sc = new Scanner(System.in);

    // --- Initialisation joueur ---
    clearConsole();
    System.out.println("Joueur : entrez votre pseudo : ");
    String nom = sc.nextLine();
    clearConsole();
    Couleur couleur = Couleur.demandeCouleur();
    Joueur humain = new Joueur(nom, couleur);

    // --- Initialisation Bot ---
    Couleur botColor = (couleur == Couleur.BLANC) ? Couleur.NOIR : Couleur.BLANC;
    Bot bot;
    try {
        bot = new Bot();
    } catch (Exception e) {
        System.out.println("Erreur lors du démarrage du Bot : " + e.getMessage());
        return;
    }

    // --- Initialisation plateau ---
    Plateau plateau = new Plateau(type);

    boolean readyHuman = true;

    // --- Début de la boucle de jeu ---
    while (true) {
        // --- Tour Humain ---
        do {
            humain.echecJoueur(plateau);
            int[] co1 = humain.choixDeplacement(humain.getPseudo() + " choisissez une pièce à déplacer : ");
            if (co1[0] == -1) { startBot(type); return; } // reset
            clearConsole();
            System.out.println(plateau);
            int[] co2 = humain.choixDeplacement("Où voulez-vous déplacer la pièce ?");
            readyHuman = !humain.demanderDeplacement(plateau, co1, co2);
            clearConsole();
            System.out.println(plateau);
        } while (readyHuman);

    

        // --- Tour du Bot ---
        try {
            System.out.println("Le Bot réfléchit...");
            Thread.sleep(1000); // Pause pour simuler la réflexion du bot
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //Le bot doit jouer son coup
        String move = "";
        try {
            move = bot.jouer(plateau);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        plateau.appliquerCoupUCI(move);
        System.out.println("Bot joue : " + move);
        wait(1000);
        clearConsole();
        System.out.println(plateau);}
    }


    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public final static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args){
        ChessWithMe.start(Demo.GAME);
    }
}
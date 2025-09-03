package main;

import java.util.Scanner;


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
        Couleur couleur = Couleur.demandeCouleur();
        j1 = new Joueur(nom,couleur); //crée un joueur 1 avec couleur et pseudo
        clearConsole();
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("Joueur 2 : entrez votre pseudo : ");
        String nom2 = sc2.nextLine(); 
        j2 = new Joueur(nom2); // crée le joueur 2 seulement avec le pseudo 
        if ( j1.getCouleur() == Couleur.BLANC){// se base sur le choix de la couleur du joueur 1 pour donner une nouvelle couleur au joueur 2 
            j2.setCouleur(Couleur.NOIR); 
        }else{
            j2.setCouleur(Couleur.BLANC); 
        }
        clearConsole();
        System.out.println("Joueur 1 : " + j1.getPseudo() + " (" + j1.getCouleur() + ")");
        System.out.println("Joueur 2 : " + j2.getPseudo() + " (" + j2.getCouleur() + ")");

        Plateau plateau = new Plateau(type);
        
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
                j1.echecJoueur(plateau);
                int [] co1 = j1.choixDeplacement(j1.getPseudo() + " choisie une pièce à déplacer (ex: a2 ou 2a): ");
                if(co1[0] == -1 && co1[1] == -1){
                    start(type);
                    return;
                }
                int [] co2 = j2.choixDeplacement(j1.getPseudo() + " où voux tu bouger la pièce ? (ex: a2 ou 2a): ");
                readyj1 = !j1.demanderDeplacement(plateau,co1,co2);
                clearConsole();
                System.out.println(plateau);
            } while (readyj1);

            wait(1000);

            do {
                j2.echecJoueur(plateau);
                int [] co3 = j1.choixDeplacement(j2.getPseudo() + " choisie une pièce à déplacer (ex: a2 ou 2a): ");
                if(co3[0] == -1 && co3[1] == -1){
                    start(type);
                    return;
                }
                int [] co4 = j2.choixDeplacement(j2.getPseudo() + " où voux tu bouger la pièce ? (ex: a2 ou 2a): ");
                readyj2 = !j2.demanderDeplacement(plateau,co3,co4);
                clearConsole();
                System.out.println(plateau);
            } while (readyj2);
            
            readyj1 = false;
            readyj2 = false;
        }while(true);
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
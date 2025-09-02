package main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ChessWithMe {
    public static void main(String[] args) {

        //Choix Nom et couleur
        Scanner sc = new Scanner(System.in); 
        System.out.println("Joueur 1 : entrez votre pseudo : ");
        String nom = sc.nextLine(); 
        Couleur couleur = Couleur.demandeCouleur();
        Joueur j1 = new Joueur(nom,couleur); //crée un joueur 1 avec couleur et pseudo 
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("Joueur 2 : entrez votre pseudo : ");
        String nom2 = sc2.nextLine(); 
        Joueur j2 = new Joueur(nom2); // crée le joueur 2 seulement avec le pseudo 
        if ( j1.getCouleur() == Couleur.BLANC){// se base sur le choix de la couleur du joueur 1 pour donner une nouvelle couleur au joueur 2 
            j2.setCouleur(Couleur.NOIR); 
        }else{
            j2.setCouleur(Couleur.BLANC); 
        }
        System.out.println("Joueur 1 : " + j1.getPseudo() + " (" + j1.getCouleur() + ")");
        System.out.println("Joueur 2 : " + j2.getPseudo() + " (" + j2.getCouleur() + ")");

        Plateau plateau = new Plateau();
        System.out.println(plateau);
        wait(5000);
        //Exemple de déplacements
        plateau.getPlateau()[1][0].move(plateau, new int[] { 1, 0 }, new int[] { 3, 0 });
        System.out.println(plateau);
        wait(5000);
        plateau.getPlateau()[3][0].move(plateau, new int[] { 3, 0 }, new int[] { 5, 0 });
        System.out.println(plateau);
        wait(5000);
        plateau.getPlateau()[0][0].move(plateau, new int[] { 0, 0 }, new int[] { 1, 0 });
        System.out.println(plateau);
        wait(5000);
        plateau.getPlateau()[0][1].move(plateau, new int[] { 0, 1 }, new int[] { 2, 0 });
        System.out.println(plateau);
        wait(5000);
        plateau.getPlateau()[1][3].move(plateau, new int[] { 1, 3 }, new int[] { 2 , 3 });
        System.out.println(plateau);
        wait(5000);
        plateau.getPlateau()[0][2].move(plateau, new int[] { 0, 2 }, new int[] { 3, 5});
        System.out.println(plateau);
        wait(5000);
        plateau.getPlateau()[0][4].move(plateau, new int[] { 0, 4 }, new int[] { 1, 3 });
        System.out.println(plateau);
        wait(5000);
        plateau.getPlateau()[0][3].move(plateau, new int[] { 0, 3 }, new int[] { 0, 0 });
        System.out.println(plateau);
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
        try
        {
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
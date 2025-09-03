package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.Joueur;

/* Classe qui va permettre l'importation des données basées sur les formulaires des élèves */
public class Gestion{
    private static final String CHEMIN_DOSSIER = "./res";
    private static final String CHEMIN_FICHIER = CHEMIN_DOSSIER + "/PlayerHistoricGames.txt";

    // Sauvegarde une partie dans le fichier
    public static void sauvegarderPartie(Joueur j1, Joueur j2) {
        try {
            // Crée le dossier s'il n'existe pas
            File dossier = new File(CHEMIN_DOSSIER);
            if (!dossier.exists()) {
                dossier.mkdirs();
            }

            // Écriture dans le fichier (ajout à la fin)
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(CHEMIN_FICHIER, true))) {
                writer.write(j1.getPseudo() + " vs " + j2.getPseudo());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lit toutes les parties sauvegardées
    public static List<String> lireParties() {
        List<String> parties = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CHEMIN_FICHIER))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                parties.add(ligne);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Aucune partie sauvegardée pour le moment.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parties;
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        System.out.println("Gestion des parties");
        Joueur j1 = new Joueur("Alice",Couleur.BLANC);
        System.out.println("non non " + j1);
        Joueur j2 = new Joueur("Bob",Couleur.NOIR);

        Gestion.sauvegarderPartie(j1, j2);

        List<String> parties = Gestion.lireParties();
        for (String partie : parties) {
            System.out.println(partie);
        }
    }
}
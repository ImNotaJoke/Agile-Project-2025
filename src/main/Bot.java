package main;
import 
public class Bot {
    private Couleur couleur;

    public Bot(Couleur couleur) {
        this.couleur = couleur;
    }

    public void jouer(Plateau plateau) {
        // 1️⃣ Récupérer la FEN du plateau
        String fen = plateau.toFEN();
        System.out.println("FEN actuelle : " + fen);

        // 2️⃣ Calculer le meilleur coup avec Carballo (exemple)
        String bestMove = CarballoEngine.getBestMove(fen, couleur); // méthode fictive à adapter
        System.out.println("Bot joue : " + bestMove);

        // 3️⃣ Appliquer le coup sur le plateau
        plateau.appliquerCoupUCI(bestMove);
    }
}

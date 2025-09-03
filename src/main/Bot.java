package main;


public class Bot {
    private Stockfish engine;

    public Bot() throws Exception {
        // adapte le chemin selon ton OS
        engine = new Stockfish("./engines/stockfish.exe");
    }

    public String jouer(Plateau plateau) throws Exception {
        String fen = plateau.toFEN();
        String bestMove = engine.getBestMove(fen, 15); // profondeur 15
        return bestMove;
    }

    public void close() throws Exception {
        engine.close();
    }
}

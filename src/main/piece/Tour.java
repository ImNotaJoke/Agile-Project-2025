package main.piece;

import main.Couleur;
import main.Plateau;

public class Tour extends Piece {
    public Tour(Couleur color) {
        super(color, PieceName.TOUR);
    }

    

    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        if(newPosition[0] < 8 && newPosition[0] >= 0 && newPosition[1] < 8 && newPosition[1] >= 0) {
            if ((oldPosition[0] == newPosition[0] || oldPosition[1] == newPosition[1]) && super.maxDepl(plateau, oldPosition, newPosition)){
                return true;
            } else if ((oldPosition[0] == newPosition[0] || oldPosition[1] == newPosition[1]) && super.mange(plateau, oldPosition, newPosition)){
                return true;
            }
        } 
        return false;
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        Piece[][] plat = plateau.getPlateau();
        if (moveIsOk(plat, oldPosition, newPosition)) {
            plat[newPosition[0]][newPosition[1]] = this;
            plat[oldPosition[0]][oldPosition[1]] = null;
            plateau.setPlateau(plat);
            return true;
        }
        System.out.println("Mouvement impossible pour la tour");
        return false;
    }
}
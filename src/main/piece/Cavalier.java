package main.piece;

import main.Couleur;
import main.Plateau;

public class Cavalier extends Piece {
    public Cavalier(Couleur color) {
        super(color, PieceName.CAVALIER);
    }

    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        if(newPosition[0] < 8 && newPosition[0] >= 0 && newPosition[1] < 8 && newPosition[1] >= 0) {
            if(((Math.abs(oldPosition[0] - newPosition[0]) == 2 && Math.abs(oldPosition[1] - newPosition[1]) == 1)|| (Math.abs(oldPosition[0] - newPosition[0]) == 1 && Math.abs(oldPosition[1] - newPosition[1]) == 2)) 
                    && (plateau[newPosition[0]][newPosition[1]] == null)){
                return true;
            } else if(((Math.abs(oldPosition[0] - newPosition[0]) == 2 && Math.abs(oldPosition[1] - newPosition[1]) == 1)|| (Math.abs(oldPosition[0] - newPosition[0]) == 1 && Math.abs(oldPosition[1] - newPosition[1]) == 2)) 
                    && (plateau[newPosition[0]][newPosition[1]].getColor() != this.getColor())){
                return true;
            }
        }
        return false;
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        Piece[][] plat = plateau.getPlateau();
        if (this.moveIsOk(plat, oldPosition, newPosition)) {
            plat[newPosition[0]][newPosition[1]] = this;
            plat[oldPosition[0]][oldPosition[1]] = null;
            plateau.setPlateau(plat);
            return true;
        }
        System.out.println("Mouvement impossible pour le cavalier");
        return false;
    }
}

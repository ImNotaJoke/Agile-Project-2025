package main.piece;

import main.Couleur;
import main.Plateau;

public class Dame extends Piece {
    public Dame(Couleur color) {
        super(color, PieceName.DAME);
    }
    
    public boolean moveIsOk(Piece[][] plateau, int[] oldPosition, int[] newPosition) {
        if(oldPosition[0] < 8 && oldPosition[0] >= 0 && oldPosition[1] < 8 && oldPosition[1] >= 0) {
            if((oldPosition[0] == newPosition[0] || oldPosition[1] == newPosition[1]) && super.maxDepl(plateau, oldPosition, newPosition)){
                return true;
            }else if(oldPosition[0] == newPosition[0] && oldPosition[1] == newPosition[1] && super.mange(plateau, oldPosition, newPosition)){
                return true;
            }else if(newPosition[0] < 7 && newPosition[0] >= 0 && newPosition[1] < 7 && newPosition[1] >= 0) {
                if (Math.abs(oldPosition[0] - newPosition[0]) == Math.abs(oldPosition[1] - newPosition[1]) && super.maxDepl(plateau, oldPosition, newPosition)) {
                    return true;
                }
                if (Math.abs(oldPosition[0] - newPosition[0]) == Math.abs(oldPosition[1] - newPosition[1]) && super.mange(plateau, oldPosition, newPosition)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean move(Plateau plateau, int[] oldPosition, int[] newPosition) {
        if (moveIsOk(plateau.getPlateau(), oldPosition, newPosition)) {
            plateau.getPlateau()[newPosition[0]][newPosition[1]] = this;
            plateau.getPlateau()[oldPosition[0]][oldPosition[1]] = null;
            return true;
        }
        System.out.println("Mouvement impossible pour la dame");
        return false;
    }
}

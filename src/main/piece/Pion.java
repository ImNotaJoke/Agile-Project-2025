package main.piece;
import main.Couleur;

public class Pion extends Piece {
    public Pion(Couleur color, int[] position) {
        super(color, PieceName.PION, position);
    }
    
    public int[] moveIsOk(){
        int oldPosition[] = super.getPosition();
        if(super.getColor() == Couleur.BLANC){
            if(oldPosition[1] <= 7 && oldPosition[1] > 0 && oldPosition[0] >= 0 && oldPosition[0] <= 7){
                return new int[]{1, -1};
            }else{
                return new int[]{0, 0};
            }
        }else{
            if(oldPosition[1] < 7 && oldPosition[1] >= 0 && oldPosition[0] >= 0 && oldPosition[0] <= 7){
                return new int[]{1, 1};
            }else{
                return new int[]{0, 0};
            }
        }
    }

    public boolean move(){
        int[] move = this.moveIsOk();
        int[] oldPosition = super.getPosition();
        if(move[0] == 1){
            super.setPosition(new int[]{oldPosition[0],oldPosition[1] + move[1]});
            return true;
        }else{
            return false;
        }
    }
}

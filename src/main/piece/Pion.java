package main.piece;

public class Pion extends Piece {
    public Pion(String color, int[] position) {
        super(color, PieceName.PION, position);
    }
    
    public boolean moveIsOk(){
        if(super.getColor().equals("blanc")){
            if(super.getPosition()[1] < 7 && super.getPosition()[1] >= 0 && super.getPosition()[0] >= 0 && super.getPosition()[0] < 8){
                if{(super.getPosition()[1]-1) }
            }
        }
    }
}

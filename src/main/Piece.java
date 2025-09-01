package main;

public class Piece{
    String color;
    PieceName name;

    public String getColor(){
        return this.color; 
    }

    public String getPiece(){
        if(this.name == PieceName.PION){
            return "P"; 
        }
        else if(this.name == PieceName.TOUR){
            return "T"; 
        }
        else if(this.name == PieceName.CAVALIER){
            return "C"; 
        }
        else if(this.name == PieceName.FOU){
            return "F"; 
        }
        else if(this.name == PieceName.DAME){
            return "D"; 
        }
        else{
            return "R"; 
        }
    }
}
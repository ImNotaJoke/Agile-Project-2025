package main;

public class Piece{
    String color;
    PieceName name;

    public String getColor(){
        return this.color; 
    }

    public String getPiece(){
        if(this.name == PieceName.PION){
            return "♟"; 
        }
        else if(this.name == PieceName.TOUR){
            return "♜"; 
        }
        else if(this.name == PieceName.CAVALIER){
            return "♞"; 
        }
        else if(this.name == PieceName.FOU){
            return "♝"; 
        }
        else if(this.name == PieceName.DAME){
            return "♛"; 
        }
        else{
            return "♚"; 
        }
    }
}
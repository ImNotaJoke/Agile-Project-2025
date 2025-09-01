package main;
public class Plateau {
    private Piece[][] plateau;
    private String[][] plateauCouleur;

    public Plateau() {
        this.plateau = new Piece[8][8];
        this.plateauCouleur = new String[8][8];
    }

    public void initPlateau(){
        for(int i=0;i<8;i++){
            for(int k=0;k<8;k++){
                this.plateau[i][k] = null;
            }
        }
    }

    public void initPlateauCouleur(){
        for(int i=0;i<8;i++){
            for(int k=0;k<8;k++){
                if((i+k)%2==0){
                    this.plateauCouleur[i][k] = "⬛";
                } else {
                    this.plateauCouleur[i][k] = "⬜";
                }
            }
        }
    }

    public String toString(){
        String s = "";
        
        for(int i=0;i<8;i++){
            for(int k=0;k<8;k++){
                if(plateau[i][k] == null){
                    s+= plateauCouleur[i][k];
                }else{
                    s+= plateauCouleur[i][k]; //A CHANGER
                }
            }
            s+= "\n";
        }

        return s;
    }
    
}
package main;

public class CreationJoueur{
    /* Attributs */
        private String pseudo; 
        private Couleur couleur ; 
    
    /*Constructeurs */
        public CreationJoueur(String pseudo, Couleur coul){
            this.pseudo = pseudo; 
            this.couleur = coul ; 
        }
    /*Getter */
        public String getPseudo(){
            return this.pseudo; 
        }
        public Couleur getCouleur(){
            return this.couleur; 
        }
        // un joueur ne peux changer de couleur au cours d'une partie //
    } 

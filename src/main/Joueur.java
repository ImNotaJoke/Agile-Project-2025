package main;

public class Joueur {
    /* Attributs */
    private String pseudo;
    private Couleur couleur;

    /* Constructeurs */
    public Joueur(String pseudo, Couleur coul) {
        this.pseudo = pseudo;
        this.couleur = coul;
    }

    public Joueur(String pseudo) {
        this.pseudo = pseudo;
    }

    /* Getter */
    public String getPseudo() {
        return this.pseudo;
    }

    public Couleur getCouleur() {
        return this.couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    /* Methodes */
    @Override
    public String toString() {
        return " " + this.pseudo + " : " + this.getCouleur();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Joueur others = (Joueur) obj;
        if (this.pseudo != others.pseudo) {
            return false;
        }
        return true;
    }
}

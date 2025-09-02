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

    // un joueur ne peux changer de couleur au cours d'une partie //
    // faire en sorte que l'user entre lui même son pseudo //
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
    // public static void main(String[] args) {
    // Joueur j = new Joueur("aa", Couleur.BLANC);
    // System.out.println(j + "aaaaaaaaaaaaaaaaaaaaaaaaa");
    // }

    // public String choixPseudo() {

    // Scanner rep = new Scanner(System.in);
    // System.out.println(" Joueur 1 :Entrez votre pseudo: ");
    // String nom = rep.nextLine();
    // joueur1 = new Joueur(nom);
    // Scanner rep2 = new Scanner(System.in);
    // System.out.println("Joueur 2 : Entrez votre pseudo: ");
    // String nomj2 = rep2.nextLine();
    // joueur2 = new Joueur(nomj2);
    // }

}

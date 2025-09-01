package src;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class ChoixCouleurTest{

    @Test
    public void testDemandeCouleurBlanc() {
        // Simule l'entrée utilisateur "1"
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Couleur couleur = ChoixCouleur.demandeCouleur();

        assertEquals(Couleur.BLANC, couleur);
    }

    @Test
    public void testDemandeCouleurNoir() {
        // Simule l'entrée utilisateur "2"
        String input = "2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Couleur couleur = ChoixCouleur.demandeCouleur();
        assertEquals(Couleur.NOIR, couleur);
    }

    @Test
    public void testDemandeCouleurEntreeInvalidePuisValide() {
        // Simule l'entrée utilisateur : "3" puis "1"
        String input = "3\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Couleur couleur = ChoixCouleur.demandeCouleur();
        assertEquals(Couleur.BLANC, couleur);
    }
}

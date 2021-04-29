package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectengle;

public class TestForme {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(3);
        Rectengle rectengle = new Rectengle(3,4);
        Carre carre = new Carre(4);

        AffichageForme.afficher(cercle);
        AffichageForme.afficher(rectengle);
        AffichageForme.afficher(carre);
    }
}

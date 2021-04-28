package fr.diginamic.banque;

import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.banque.entites.ObjetGeometrique;
import fr.diginamic.banque.entites.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objGeo = new ObjetGeometrique[2];

        objGeo[0] = new Cercle(3);
        objGeo[1] = new Rectangle(3,4);

        for (ObjetGeometrique obj:
             objGeo) {
            System.out.println("perimetre = " + obj.perimetre() + ", surface = " + obj.surface());
        }
    }
}

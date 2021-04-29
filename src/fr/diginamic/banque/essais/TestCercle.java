package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Cercle2;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        Cercle2 cercle1 = new Cercle2(3);
        Cercle2 cercle2 = new Cercle2(4);

        System.out.println("Le périmètre: " + cercle1.perimetre() + " La surface: " + cercle1.surface());
        System.out.println("Le périmètre: " + cercle2.perimetre() + " La surface: " + cercle2.surface());

        Cercle2 cercle = CercleFactory.createCercle(3);
    }
}

package fr.diginamic.utils;

import fr.diginamic.banque.entites.Cercle2;

public class CercleFactory {
    public static Cercle2 createCercle(double rayon) {
        Cercle2 cercle = new Cercle2(rayon);
        return cercle;
    }
}

package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();

        for (Saison saison:
             saisons) {
            System.out.println(saison.getLibelle());
        }

        String nom = "ETE";
        Saison saison = Saison.valueOf(nom);
        System.out.println(saison.getLibelle());

        String libelle = "Hiver";
        Saison.getInstanceSaisonLibelle(libelle);
        System.out.println(Saison.getInstanceSaisonLibelle(libelle).getLibelle());
    }
}

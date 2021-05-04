package listes;

import java.util.ArrayList;

public class TestVille {
    public static void main(String[] args) {

        Ville ville1 = new Ville("Nice", 343000);
        Ville ville2 = new Ville("Carcassonne", 47800);
        Ville ville3 = new Ville("Narbonne", 53400);
        Ville ville4 = new Ville("Lyon", 484000);
        Ville ville5 = new Ville("Foix", 9700);
        Ville ville6 = new Ville("Pau", 77200);
        Ville ville7 = new Ville("Marseille", 850700);
        Ville ville8 = new Ville("Tarbes", 40600);

        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(ville1);
        villes.add(ville2);
        villes.add(ville3);
        villes.add(ville4);
        villes.add(ville5);
        villes.add(ville6);
        villes.add(ville7);
        villes.add(ville8);

        System.out.println(villes);

        System.out.println("Afficher la ville qui a plus de popu : ");
        int maxValue = villes.get(0).getNbHab();
        Ville villeMax = null;
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHab() > maxValue) {
                maxValue = villes.get(i).getNbHab();
                villeMax = villes.get(i);
            }
        }
        System.out.println(villeMax);

        // Remove
        int minValue = villes.get(0).getNbHab();
        Ville villeMin = null;
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHab() < minValue) {
                minValue = villes.get(i).getNbHab();
                villeMin = villes.get(i);
            }
        }
        villes.remove(villes.indexOf(villeMin));
        System.out.println(villes);

        // Maj les villes plus de 100_000
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHab() >= 100000) {
                villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
            }
        }
        System.out.println(villes);
    }
}

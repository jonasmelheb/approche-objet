package listes;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Comparator.comparing;

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
        int temp = 0;
        Ville ville = null;
        for (int i = 0; i < villes.size(); i++) {
            for(int j = i+1; j < villes.size(); j++){
                if(villes.get(i).getNbHab() > villes.get(j).getNbHab()){
                    temp = villes.get(i).getNbHab();
                    ville = villes.get(i);
                }
            }
        }
        System.out.println(ville);



        // Maj les villes plus de 100_000
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHab() >= 100000) {
                villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
            }
        }
        System.out.println(villes);
    }
}

package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {
    public static void main(String[] args) {
        listes.Ville ville1 = new listes.Ville("Nice", 343000);
        listes.Ville ville2 = new listes.Ville("Carcassonne", 47800);
        listes.Ville ville3 = new listes.Ville("Narbonne", 53400);
        listes.Ville ville4 = new listes.Ville("Lyon", 484000);
        listes.Ville ville5 = new listes.Ville("Foix", 9700);
        listes.Ville ville6 = new listes.Ville("Pau", 77200);
        listes.Ville ville7 = new listes.Ville("Marseille", 850700);
        listes.Ville ville8 = new listes.Ville("Tarbes", 40600);

        ArrayList<listes.Ville> villes = new ArrayList<Ville>();
        villes.add(ville1);
        villes.add(ville2);
        villes.add(ville3);
        villes.add(ville4);
        villes.add(ville5);
        villes.add(ville6);
        villes.add(ville7);
        villes.add(ville8);


        Iterator<Ville> iterator = villes.iterator();
        while (iterator.hasNext())
        {
                System.out.println(iterator.next());
        }

    }
}

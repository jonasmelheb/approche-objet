package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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

        //Pour l'exo 1 et 2
        Collections.sort(villes);

        Iterator<Ville> iterator = villes.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //un tri avec le eme comparateur
        Collections.sort(villes, new ComparatorNom());
        System.out.println();
        System.out.println("un tri avec le 1er comparateur");

        iterator = villes.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //un tri avec le eme comparateur
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println();
        System.out.println("un tri avec le 2eme comparateur");

        iterator = villes.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}

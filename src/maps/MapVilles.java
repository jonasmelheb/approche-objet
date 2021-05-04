package maps;

import listes.Ville;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Nice", 343000);
        Ville ville2 = new Ville("Carcassonne", 47800);
        Ville ville3 = new Ville("Narbonne", 53400);
        Ville ville4 = new Ville("Lyon", 484000);
        Ville ville5 = new Ville("Foix", 9700);
        Ville ville6 = new Ville("Pau", 77200);
        Ville ville7 = new Ville("Marseille", 850700);
        Ville ville8 = new Ville("Tarbes", 40600);

        HashMap<String, Ville> mapVilles  = new HashMap<>();
        mapVilles.put(ville1.getNom(),ville1);
        mapVilles.put(ville2.getNom(),ville2);
        mapVilles.put(ville3.getNom(),ville3);
        mapVilles.put(ville4.getNom(),ville4);
        mapVilles.put(ville5.getNom(),ville5);
        mapVilles.put(ville6.getNom(),ville6);
        mapVilles.put(ville7.getNom(),ville7);
        mapVilles.put(ville8.getNom(),ville8);

        Iterator<String> iterator = mapVilles.keySet().iterator();
        int minValue = mapVilles.get("Nice").getNbHab();
        String keySupp = null;
        while (iterator.hasNext())
        {
            String key = iterator.next();
            Ville value = mapVilles.get(key);

            if (value.getNbHab() < minValue) {
                minValue = value.getNbHab();
                keySupp = value.getNom();
            }
        }

        mapVilles.remove(keySupp);

        iterator = mapVilles.keySet().iterator();
        while (iterator.hasNext())
        {
            String key = iterator.next();
            Ville value = mapVilles.get(key);
            System.out.println(value);

        }
    }
}

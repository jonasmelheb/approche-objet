package maps;

import listes.Ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        /**
         * France, 65 millions d’habitants, Europe
         * o Allemagne, 80 millions d’habitants, Europe
         * o Belgique, 10 millions d’habitants, Europe
         * o Russie, 150 millions d’habitants, Asie
         * o Chine, 1.4 milliards d’habitants, Asie
         * o Indonésie, 220 millions d’habitants, Océanie,
         * o Australie, 20 millions d’habitants, Océanie
         */

        ArrayList<Pays> pays = new ArrayList<>();
        pays.add(new Pays("France", 65_000_000,"Europe"));
        pays.add(new Pays("Allemagne", 80_000_000,"Europe"));
        pays.add(new Pays("Belgique", 10_000_000,"Europe"));
        pays.add(new Pays("Russie", 150_000_000,"Asie"));
        pays.add(new Pays("Chine", 1_400_000_000,"Asie"));
        pays.add(new Pays("Indonésie", 220_000_000,"Océanie"));
        pays.add(new Pays("Australie", 20_000_000,"Océanie"));

        HashMap<String,Integer> mapPays = new HashMap<>();
        Iterator<Pays> iterator = pays.iterator();
        while (iterator.hasNext())
        {

            Pays paysPut = iterator.next();
            if (mapPays.get(paysPut.getContinent()) == null) {
                mapPays.put(paysPut.getContinent(), 1);
            } else{
                mapPays.put(paysPut.getContinent(), mapPays.get(paysPut.getContinent())+1);
            }
        }

        Iterator<String> iteratorNew = mapPays.keySet().iterator();
        while (iteratorNew.hasNext())
        {
            String key = iteratorNew.next();
            int nbCon = mapPays.get(key);
            System.out.println(key + " " + nbCon);
        }
    }
}

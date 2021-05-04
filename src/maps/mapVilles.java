package maps;

import java.util.HashMap;
import java.util.Iterator;

public class mapVilles {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(15, "Bordeaux");

        Iterator<Integer> iterator = mapVilles.keySet().iterator();

        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.println(key);
        }
        Iterator<String> iteratorVille = mapVilles.values().iterator();
        while (iteratorVille.hasNext()) {
            String value = iteratorVille.next();
            System.out.println(value);
        }

        System.out.println("La taille : " + mapVilles.size());
    }
}

package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, Double> mapSalaires = new HashMap<>();

        mapSalaires.put("Paul", 1750.0);
        mapSalaires.put("Hicham", 1825.0);
        mapSalaires.put("Yu",2250.0);
        mapSalaires.put("Ingrid",2015.0);
        mapSalaires.put("Chantal",2418.0);

        Iterator<String> iterator = mapSalaires.keySet().iterator();
        while (iterator.hasNext())
        {
            String salairie = iterator.next();
            double salaire = mapSalaires.get(salairie);
            System.out.println(salairie +" -> " + salaire + " €");
        }

        System.out.println("La taille : " + mapSalaires.size());
    }
}

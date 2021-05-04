package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {
    public static void main(String args[]) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>(map1);
        map3.putAll(map2);

        Iterator<Integer> iterator = map3.keySet().iterator();

        while (iterator.hasNext())
        {
            int key = iterator.next();
            String value = map3.get(key);
            System.out.println(key +" "+value);
        }

    }
}

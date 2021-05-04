package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> hs = new HashSet<>();
        hs.add(1.5);
        hs.add(8.25);
        hs.add(-7.32);
        hs.add(13.3);
        hs.add(-12.45);
        hs.add(48.5);
        hs.add(0.01);

        System.out.println(hs);

        //avec iterator
        Iterator<Double> i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(Collections.max(hs));

        double min = Collections.min(hs);
        hs.remove(min);
        System.out.println(hs);
    }
}

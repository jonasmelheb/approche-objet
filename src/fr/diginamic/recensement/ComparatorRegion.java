package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorRegion implements Comparator<Region> {

    @Override
    public int compare(Region r1, Region r2) {
        if (r2.getPopulation() > r1.getPopulation()) {
            return 1;
        }
        else if (r2.getPopulation() < r1.getPopulation()) {
            return -1;
        }
        return 0;
    }
}
package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorDepartement implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {
        if (d2.getPopulation() > d1.getPopulation()) {
            return 1;
        }
        else if (d2.getPopulation() < d1.getPopulation()) {
            return -1;
        }
        return 0;
    }
}

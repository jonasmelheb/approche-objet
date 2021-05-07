package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;

public class RechercheRegionPeuple extends MenuService{

    @Override
    public void traiter(Recensement recensement, String scanner) {
        List<Ville> villes = recensement.getListeVille();
        Collections.sort(villes, new ComparatorVille());
        System.out.println();
    }
}

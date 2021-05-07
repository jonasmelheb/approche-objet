package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;

public class RechercheVillePeupleFrance extends MenuService{
    @Override
    public void traiter(Recensement recensement, String scanner) {
        List<Ville> villes = recensement.getListeVille();
        Collections.sort(villes, new ComparatorVille());

        for (int i = 0; i < 10; i++) {
            System.out.println(villes.get(i));
        }
    }
    }

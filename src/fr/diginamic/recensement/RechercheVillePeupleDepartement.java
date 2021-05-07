package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RechercheVillePeupleDepartement extends MenuService{
    @Override
    public void traiter(Recensement recensement, String scanner) {
        List<Ville> villes = recensement.getListeVille();
        List<Ville> VilleList = new ArrayList<>();

        for (int i = 0; i < villes.size(); i++) {
            Ville ville = villes.get(i);
            if (ville.getCodeDepartement().equalsIgnoreCase(scanner)) {
                Ville villePut = new Ville(ville.getCodeRegion(), ville.getNomRegion(), ville.getCodeDepartement(), ville.getCodeCommune(), ville.getNomCommune(), ville.getPopulation());
                VilleList.add(villePut);
            }
        }
        Collections.sort(VilleList, new ComparatorVille());

        for (int i = 0; i < 10; i++) {
            System.out.println(VilleList.get(i));
        }
    }
}

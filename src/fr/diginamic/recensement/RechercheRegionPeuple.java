package fr.diginamic.recensement;

import java.util.*;

public class RechercheRegionPeuple extends MenuService{

    @Override
    public void traiter(Recensement recensement, String scanner) {
        List<Ville> villes = recensement.getListeVille();
        HashMap<String, Region> mapRegion = new HashMap<>();

        for (int i = 0; i < villes.size(); i++) {
            Ville ville = villes.get(i);
            String nomRegion = ville.getNomRegion();
            Region region = mapRegion.get(nomRegion);

            if (region == null) {
                region = new Region(ville.getNomRegion(), ville.getPopulation());
                mapRegion.put(ville.getNomRegion(), region);
            } else{
                int populationRegion = region.getPopulation() + ville.getPopulation();
                region.setPopulation(populationRegion);
            }
        }
        List<Region> newList = new ArrayList<>(mapRegion.values());

        Collections.sort(newList, new ComparatorRegion());

        for (int i = 0; i < 10; i++) {
            System.out.println(newList.get(i));
        }
    }
}

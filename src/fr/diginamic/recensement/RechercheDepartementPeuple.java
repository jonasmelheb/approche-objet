package fr.diginamic.recensement;

import java.util.*;

public class RechercheDepartementPeuple extends MenuService{
    @Override
    public void traiter(Recensement recensement, String scanner) {
        List<Ville> villes = recensement.getListeVille();
        HashMap<String, Departement> mapDepartement = new HashMap<>();

        for (int i = 0; i < villes.size(); i++) {
            Ville ville = villes.get(i);
            String nomDepartement = ville.getCodeDepartement();
            Departement departement = mapDepartement.get(nomDepartement);

            if (departement == null) {
                departement = new Departement(ville.getCodeDepartement(), ville.getPopulation());
                mapDepartement.put(ville.getCodeDepartement(), departement);
            } else{
                int populationRegion = departement.getPopulation() + ville.getPopulation();
                departement.setPopulation(populationRegion);
            }
        }
        List<Departement> newList = new ArrayList<>(mapDepartement.values());

        Collections.sort(newList, new ComparatorDepartement());

        for (int i = 0; i < 10; i++) {
            System.out.println(newList.get(i));
        }
    }
}

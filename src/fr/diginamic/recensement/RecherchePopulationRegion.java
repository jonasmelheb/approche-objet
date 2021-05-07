package fr.diginamic.recensement;

public class RecherchePopulationRegion extends MenuService{

    @Override
    public void traiter(Recensement recensement, String scanner) {
        int populationRegion = 0;
        for(Ville region : recensement.getListeVille()) {
            if(region.getNomRegion().equalsIgnoreCase(scanner)) {
                populationRegion += region.getPopulation();
            }
        }
        System.out.println("le nombre population de la région "+ scanner +" : ");
        System.out.println(populationRegion);
    }
}

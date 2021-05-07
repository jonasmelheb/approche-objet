package fr.diginamic.recensement;

public class RecherchePopulationDepartement extends MenuService{
    @Override
    public void traiter(Recensement recensement, String scanner) {
        int populationDepartement = 0;
        for(Ville departement : recensement.getListeVille()) {
            if(departement.getCodeDepartement().equalsIgnoreCase(scanner)) {
                populationDepartement += departement.getPopulation();
            }
        }
        System.out.println("le nombre population du département " + scanner + "est : ");
        System.out.println(populationDepartement);

    }
}

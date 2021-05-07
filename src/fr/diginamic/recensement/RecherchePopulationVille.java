package fr.diginamic.recensement;


public class RecherchePopulationVille extends MenuService{
    @Override
    public void traiter(Recensement recensement, String scanner) {
        for(Ville ville : recensement.getListeVille()) {
            if(ville.getNomCommune().equalsIgnoreCase(scanner)) {
                System.out.println("le nombre population de la ville " + ville.getNomCommune() + " est : ");
                System.out.println(ville.getPopulation());
            }
        }

    }
}

package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Recensement recensement = new Recensement();
            System.out.println(
                    "Veuillez sélectionner : \n " +
                            "Taper 1 pour avoir la Population d’une ville \n " +
                            "Taper 2 pour avoir la Population d’un département donné \n " +
                            "Taper 3 pour avoir la Population d’une région donnée \n " +
                            "Taper 4 pour Afficher les 10 régions les plus peuplées \n " +
                            "Taper 5 pour Afficher les 10 départements les plus peuplés \n");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("entrer le nom de la ville: ");
                    String villeScan = scanner.next();
                    RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
                    recherchePopulationVille.traiter(recensement, villeScan);
                    break;
                case 2:
                    System.out.println("entrer le code de votre departement: ");
                    String codeDepartement = scanner.next();
                    RecherchePopulationDepartement recherchePopulationDepartement = new RecherchePopulationDepartement();
                    recherchePopulationDepartement.traiter(recensement, codeDepartement);
                    break;
                case 3:
                    System.out.println("entrer le nom de la région : ");
                    String nomRegion = scanner.next();
                    RecherchePopulationRegion recherchePopulationRegion = new RecherchePopulationRegion();
                    recherchePopulationRegion.traiter(recensement, nomRegion);
                    break;
                case 4:
                    RechercheRegionPeuple rechercheRegionPeuple = new RechercheRegionPeuple();
                    rechercheRegionPeuple.traiter(recensement, null);
                    break;
                case 5:
                    RechercheDepartementPeuple rechercheDepartementPeuple = new RechercheDepartementPeuple();
                    rechercheDepartementPeuple.traiter(recensement, null);
                    break;
                default:
                    System.out.println(
                            "Oups, vous n'avez pas rentré un chiffre valide...");
            }
        }

}

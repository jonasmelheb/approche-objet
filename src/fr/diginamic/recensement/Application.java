package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Recensement recensement = new Recensement();
        boolean stop = false;
        while (stop == false) {
            System.out.println(
                    "Veuillez sélectionner : \n " +
                            "Taper 1 pour avoir la Population d’une ville \n " +
                            "Taper 2 pour avoir la Population d’un département donné \n " +
                            "Taper 3 pour avoir la Population d’une région donnée \n " +
                            "Taper 4 pour Afficher les 10 régions les plus peuplées \n " +
                            "Taper 5 pour Afficher les 10 départements les plus peuplés \n " +
                            "Taper 6 pour Afficher les 10 Ville les plus peuplés d'un département \n " +
                            "Taper 7 pour Afficher les 10 Ville les plus peuplés d'une Région \n " +
                            "Taper 8 pour Afficher les 10 villes les plus peuplées de France \n " +
                            "Taper 9 pour Sortir \n");
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
                case 6:
                    System.out.println("entrer le code de votre departement: ");
                    codeDepartement = scanner.next();
                    RechercheVillePeupleDepartement rechercheVillePeupleDepartement = new RechercheVillePeupleDepartement();
                    rechercheVillePeupleDepartement.traiter(recensement, codeDepartement);
                    break;
                case 7:
                    System.out.println("entrer le nom de la région: ");
                    nomRegion = scanner.next();
                    RechercheVillePeupleRegion rechercheVillePeupleRegion = new RechercheVillePeupleRegion();
                    rechercheVillePeupleRegion.traiter(recensement, nomRegion);
                    break;
                case 8:
                    RechercheVillePeupleFrance rechercheVillePeupleFrance = new RechercheVillePeupleFrance();
                    rechercheVillePeupleFrance.traiter(recensement, null);
                    break;
                case 9:
                    stop = true;
                    break;
                default:
                    System.out.println(
                            "Oups, vous n'avez pas rentré un chiffre valide...");
            }
        }
    }

}

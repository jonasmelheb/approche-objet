package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int maxCapacite;
    private int totalClient;
    private double totalRecette;

    public Theatre(String nom, int maxCapacite, int totalClient, double totalRecette) {
        this.nom = nom;
        this.maxCapacite = maxCapacite;
        this.totalClient = totalClient;
        this.totalRecette = totalRecette;
    }

    public void inscrire(int nbClient, double prixPLace) {
        if (maxCapacite >= (totalClient + nbClient)) {
            totalClient += nbClient;
            totalRecette += prixPLace * nbClient;
        } else {
            System.out.println("Nombre max atteint !");
        }
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "totalClient=" + totalClient +
                ", totalRecette=" + totalRecette +
                '}';
    }
}

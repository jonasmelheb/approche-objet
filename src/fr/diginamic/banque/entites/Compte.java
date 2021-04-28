package fr.diginamic.banque.entites;

public class Compte {

    private int numCompte;
    private double soldeCompte;

    public Compte(int numCompte, double soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    private int getNumCompte() {
        return numCompte;
    }

    private double getSoldeCompte() {
        return soldeCompte;
    }

    private void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    private void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

}

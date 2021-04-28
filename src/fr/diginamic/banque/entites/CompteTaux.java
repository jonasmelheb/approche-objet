package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private int taxRemunerations;

    public CompteTaux(int numCompte, double soldeCompte, int taxRemunerations) {
        super(numCompte, soldeCompte);
        this.taxRemunerations = taxRemunerations;
    }

    @Override
    public String toString() {
        return super.toString() + ", tauxRemuniration=" + taxRemunerations ;
    }

    public int gettauxRemuniration() {
        return taxRemunerations;
    }

    public void settauxRemuniration(int tauxRemuniration) {
        this.taxRemunerations = tauxRemuniration;
    }

}

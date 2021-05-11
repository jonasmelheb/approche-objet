package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps",1),
    ETE("Été", 2),
    AUTOMNE("Automne",3),
    HIVER("Hiver",4);

    private String libelle;
    private int order;

    private Saison(String libelle, int order) {
        this.libelle = libelle;
        this.order = order;
    }

    public static Saison getInstanceSaisonLibelle(String libelle) {
        Saison[] saisons = Saison.values();

        for (Saison saison:
                saisons) {
            if (saison.getLibelle().equalsIgnoreCase(libelle)) {
                return saison;
            }
        }
        return null;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

package listes;

public enum Continent {
    AFRIQUE("Afrique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    AMERIQUE("Amérique"),
    AUSTARALIE("Australie");

    private String libelle;

    private Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

package fr.diginamic.recensement;

public class Ville {
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private int codeCommune;
    private String nomCommune;
    private int population;

    public Ville(String codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune, int population) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "codeRegion=" + codeRegion +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", codeCommune=" + codeCommune +
                ", nomCommune='" + nomCommune + '\'' +
                ", Population=" + population +
                '}';
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(int codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int Population) {
        this.population = Population;
    }
}

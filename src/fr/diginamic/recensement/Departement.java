package fr.diginamic.recensement;

public class Departement {
    private String code;
    private int population;

    public Departement(String code, int population) {
        this.code = code;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "code='" + code + '\'' +
                ", population=" + population +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

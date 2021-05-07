package fr.diginamic.recensement;

public class Region {
    private String Code;
    private int population;

    public Region(String code, int population) {
        Code = code;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Region{" +
                "Code='" + Code + '\'' +
                ", population=" + population +
                '}';
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

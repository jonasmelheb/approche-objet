package fr.diginamic.formes;

public class Rectengle extends Forme {
    private double longueur;
    private double largeur;

    public Rectengle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return (longueur + largeur) * 2;
    }

    @Override
    public String toString() {
        return "Rectengle{" +
                "Surface= " + calculerSurface() +
                ", Perimetre= " + calculerPerimetre() +
                '}';
    }
}

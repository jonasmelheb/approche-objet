package fr.diginamic.interfaces.entites;

public class Cercle implements ObjetGeometrique {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return Math.PI * (rayon * rayon);
    }

    @Override
    public double surface() {
        return Math.PI * rayon;
    }
}

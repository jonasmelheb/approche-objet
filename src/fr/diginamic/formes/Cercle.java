package fr.diginamic.formes;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * (rayon * rayon);
    }

    @Override
    public double calculerPerimetre() {
        return rayon * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "Surface= " + calculerSurface() +
                ", Perimetre= " + calculerPerimetre() +
                '}';
    }
}

package fr.diginamic.formes;

public class Carre extends Rectengle{

    public Carre(double longueur) {
        super(longueur, longueur);
    }

    @Override
    public String toString() {
        return "Carre{"+
                "Surface= " + calculerSurface() +
                ", Perimetre= " + calculerPerimetre() +
                '}';
    }
}

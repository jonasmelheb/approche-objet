package fr.diginamic.interfaces.entites;

public class Rectangle implements ObjetGeometrique {
    private int largeur;
    private int longeur;

    public Rectangle(int largeur, int longeur) {
        this.largeur = largeur;
        this.longeur = longeur;
    }

    @Override
    public double perimetre() {
        return largeur * longeur;
    }

    @Override
    public double surface() {
        return (longeur + largeur) * 2;
    }
}

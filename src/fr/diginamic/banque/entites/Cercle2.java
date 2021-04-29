package fr.diginamic.banque.entites;

public class Cercle2 {
    private double rayon;

    public Cercle2(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre(){
        return Math.PI * (rayon * rayon);
    }
    public double surface(){
        return Math.PI * rayon;
    }
}

package fr.diginamic.jdr;

public abstract class Creature {
    private int force;
    private int pointDeVie;

    public Creature(int force, int pointDeVie) {
        this.force = force;
        this.pointDeVie = pointDeVie;
    }

    public abstract String getType();

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }
}

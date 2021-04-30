package fr.diginamic.jdr;

public class Loup extends Creature{

    public Loup(int force, int pointDeVie) {
        super(force, pointDeVie);
    }

    @Override
    public String getType() {
        return "Loup";
    }
}

package fr.diginamic.jdr;

public class Gobelin extends Creature{

    public Gobelin(int force, int pointDeVie) {
        super(force, pointDeVie);
    }

    @Override
    public String getType() {
        return "Gobelin";
    }

}

package fr.diginamic.jdr;

public class Troll extends Creature{

    public Troll(int force, int pointDeVie) {
        super(force, pointDeVie);
    }

    @Override
    public String getType() {
        return "Troll";
    }

}

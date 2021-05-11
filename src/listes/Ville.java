package listes;

import java.util.ArrayList;
import java.util.Objects;

public class Ville {
    private String nom;
    private int nbHab;
    private Continent continent;


    public Ville(String nom, int nbHab, Continent continent) {
        this.nom = nom;
        this.nbHab = nbHab;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHab=" + nbHab +
                ", continent=" + continent.getLibelle() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville)){
            return false;
        }
        Ville ville = (Ville) o;
        return this.nbHab == ville.getNbHab() && this.nom.equals(ville.getNom());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int nbHab) {
        this.nbHab = nbHab;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}

package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale ap = new AdressePostale(12, "blabla", 14578, "ville");

    public Personne(String nom, String prenom, AdressePostale ap) {
        this.nom = nom;
        this.prenom = prenom;
        this.ap = ap;
    }
}

package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale ap;

    public Personne(String nom, String prenom, AdressePostale ap) {
        modifieNom(nom);
        modifiePrenom(prenom);
        modifieAdresse(ap);
    }

    public void afficherNomPrenom () {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }
    public void modifieNom (String nom) {
        this.nom = nom;
    }
    public void modifiePrenom (String nom) {
        this.prenom = nom;
    }

    public void modifieAdresse (AdressePostale adress) {
        this.ap = adress;
    }

    public String returnNom () {
        return nom;
    }
    public String returnPrenom () {
        return prenom;
    }
    public AdressePostale returnAdress () {
        return ap;
    }

}

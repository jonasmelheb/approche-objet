package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        Personne p2 = new Personne();

        p1.nom = "MELHEB";
        p1.prenom = "YOUNES";
        p1.ap.codePostal = 34500;
        p1.ap.libelleRue= "Marcel prévost";
        p1.ap.numeroRue= 21;
        p1.ap.ville= "Bézies";

        p2.nom = "MELHEB";
        p2.prenom = "YOUNES";
        p2.ap.codePostal = 34500;
        p2.ap.libelleRue= "Marcel prévost";
        p2.ap.numeroRue= 21;
        p2.ap.ville= "Bézies";
    }
}

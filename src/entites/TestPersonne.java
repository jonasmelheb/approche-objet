package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(22, "blabla", 34500, "ville");
        AdressePostale adr2 = new AdressePostale(22, "blabla", 34500, "ville");

        Personne p1 = new Personne("MELHEB", "YOUNES",adr1);
        Personne p2 = new Personne("MELHEB", "YOUNES",adr2);


    }
}

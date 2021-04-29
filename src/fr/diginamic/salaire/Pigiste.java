package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int nbrJour;
    private double montantJour;

    public Pigiste(String nom, String prenom, int nbrJour, double montantJour) {
        super(nom, prenom);
        this.nbrJour = nbrJour;
        this.montantJour = montantJour;
    }


    @Override
    public double getSalaire() {
        return nbrJour * montantJour;
    }

    @Override
    public String toString() {
        return "Pigiste {" +
                "Son salaire est = " + getSalaire() +
                " €}";
    }
}

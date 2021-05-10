package tri;

public class Ville implements Comparable<Ville>{
    private String nom;
    private int nbHab;

    public Ville(String nom, int nbHab) {
        this.nom = nom;
        this.nbHab = nbHab;
    }
    @Override
    public int compareTo(Ville autre) {
        if (this.nbHab < autre.getNbHab()){
            return 1;
        }
        if (this.nbHab > autre.getNbHab()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHab=" + nbHab +
                '}';
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


}

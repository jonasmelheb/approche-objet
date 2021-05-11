package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("ville", 1);
        Ville ville2 = new Ville("ville2", 1);

        Boolean bool = ville1.equals(ville2);
        System.out.println(bool);

        //Question 2
        Boolean bool1 = ville1.getNom() == ville2.getNom();
        Boolean bool2 = ville1.getNbHab() == ville2.getNbHab();
        System.out.println(bool1);
        System.out.println(bool2);
    }
}

package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("ville", 1,Continent.EUROPE);
        Ville ville2 = new Ville("ville", 1,Continent.EUROPE);

        Boolean bool = ville1.equals(ville2);
        System.out.println(bool);

        //Question 2
        Boolean bool1 = ville1 == ville2;
        System.out.println(bool1);
    }
}

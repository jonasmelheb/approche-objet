package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String chaine = null;
        long debut = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            builder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        debut = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            chaine += i;
        }
        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
    }
}

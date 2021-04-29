package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Locale;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        // 1
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        //2
        int longueur = chaine.length();
        System.out.println("La longueur: " + longueur);

        //3
        char c = ';';
        int index = chaine.indexOf(c);
        System.out.println("La longueur: " + index);

        //4
        int start = 0;
        int end = 6;
        String subString = chaine.substring(start,end);

        //5
        System.out.println("Nom de famille: " + subString);

        //6
        System.out.println("Nom de famille en MAJ: " + subString.toUpperCase());

        //7
        System.out.println("Nom de famille en min: " + subString.toLowerCase(Locale.ROOT));

        //8
        String[] morceaux = chaine.split(";");
        System.out.println("Chaine en morceaux :");
        for (String mor:
             morceaux) {
            System.out.println(mor);
        }

        //9
        String nom = morceaux[0];
        String prenom = morceaux[1];
        double salaire = Double.parseDouble(morceaux[2].replace(" ",""));

        Salarie salarie = new Salarie(nom, prenom, salaire);
        System.out.println(salarie);
    }
}

package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Melheb", "Younes", 3000.0);
        Pigiste pigiste = new Pigiste("Durand", "Charles", 9,150.0);

        salarie.afficherDonnees();
        pigiste.afficherDonnees();
    }
}

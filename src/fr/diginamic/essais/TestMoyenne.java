package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        CalculMoyenne.ajout(2);
        CalculMoyenne.ajout(2);
        CalculMoyenne.ajout(2);
        CalculMoyenne.ajout(2);

        System.out.println(CalculMoyenne.calcule());
    }
}

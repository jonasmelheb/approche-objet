package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Younes", 6, 0, 0);

        theatre.inscrire(3,25.0);
        theatre.inscrire(3,25.0);
        theatre.inscrire(3,25.0);

        System.out.println(theatre);
    }
}

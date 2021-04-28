package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt = new Compte(25478, 2548.0);
        System.out.println(cpt.toString());
    }
}

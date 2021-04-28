package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte comptes[] = new Compte[2];

        comptes[0] = new Compte(254789, 24587.0);
        comptes[1] = new CompteTaux(000002, 145000.0,25);

        for (Compte cmpt : comptes) {
            System.out.println(cmpt);
        }
    }
}

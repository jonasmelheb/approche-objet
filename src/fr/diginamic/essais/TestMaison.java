package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Chambre chambre = new Chambre(9,1);
        Chambre chambre2 = new Chambre(6,1);
        SalleDeBain salleDeBain = new SalleDeBain(5,1);
        WC wc = new WC(2,1);

        Cuisine cuisine = new Cuisine(6,0);
        Salon salon = new Salon(11,0);

        Maison maison = new Maison();
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(null);

        System.out.println(maison.getSuperficieTotal());
        System.out.println(maison.getSuperficieParEtage(1));
        System.out.println(maison.getSuperficieTotalPiece(chambre.getType()));
        System.out.println(maison.getNombrePiece(chambre.getType()));
    }
}

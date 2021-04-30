package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
    Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece piece) {
        if (piece != null) {
            pieces = Arrays.copyOf(pieces, pieces.length + 1 );
            pieces[pieces.length - 1 ] = piece;
        }
    }

    public double getSuperficieTotal() {
        double superficie = 0;
        for (Piece piece:
             pieces) {
            superficie += piece.getSuperficie();
        }
        return superficie;
    }
    public double getSuperficieParEtage(int etage) {
        double superficie = 0;
        for (Piece piece:
                pieces) {
            if (piece.getEtage() == etage){
                superficie += piece.getSuperficie();
            }

        }
        return superficie;
    }
    public double getSuperficieTotalPiece(String type) {
        double superficie = 0;
        for (Piece piece:
                pieces) {
            if (piece.getType().equals(type)){
                superficie += piece.getSuperficie();
            }
        }
        return superficie;
    }
    public int getNombrePiece(String type) {
        int nbPiece = 0;
        for (Piece piece:
                pieces) {
            if (piece.getType().equals(type)){
                nbPiece++;
            }
        }
        return nbPiece;
    }
}

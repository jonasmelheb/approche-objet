package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations op = new Operations();

        double addition = op.calcul(1,1,'+');
        double soustraction = op.calcul(1,1,'-');
        double multiplication = op.calcul(5,2,'*');
        double division = op.calcul(6,2,'/');

        System.out.println("Addition: " + addition + ", Soustraction : " + soustraction + " ,Multiplication : " + multiplication + " Division " + division );
    }
}

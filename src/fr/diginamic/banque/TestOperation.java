package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.Date;

public class TestOperation {
    public static void main(String[] args) {
        Operation operations[] = new Operation[4];

        operations[0] = new Credit(new Date(),254);
        operations[1] = new Credit(new Date(),255);
        operations[2] = new Debit(new Date(),256);
        operations[3] = new Debit(new Date(),257);

        int sum = 0;
        for (Operation operation :
             operations) {
            if (operation.getType() == "DEBIT") {
                sum -= operation.getMontantOperation();
            } else {
                sum += operation.getMontantOperation();
            }
        }

        System.out.println(sum);
    }
}

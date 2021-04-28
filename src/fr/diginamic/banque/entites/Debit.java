package fr.diginamic.banque.entites;

import java.util.Date;

public class Debit extends Operation{
    public Debit(Date dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}

package fr.diginamic.banque.entites;

import java.util.Date;

public class Credit extends Operation{
    public Credit(Date dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}

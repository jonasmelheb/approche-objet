package fr.diginamic.banque.entites;

import java.util.Date;

public abstract class Operation {
    private Date dateOperation;
    private int montantOperation;

    @Override
    public String toString() {
        return "Operation{" +
                "dateOperation=" + dateOperation +
                ", montantOperation=" + montantOperation +
                ", Type=" + getType() +
                '}';
    }

    public abstract String getType();

    public Operation(Date dateOperation, int montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(int montantOperation) {
        this.montantOperation = montantOperation;
    }
}

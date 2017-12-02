package com.company;

public class Shedule {
    int date;
    double amountMainDebt;
    double amountNecessaryPayment;

    public Shedule (int date, double amountMainDebt, double amountNecessaryPayment) {
        this.date = date;
        this.amountMainDebt = amountMainDebt;
        this.amountNecessaryPayment = amountNecessaryPayment;
    }

    @Override
    public String toString() {
        return "\n"+date+" | "+amountMainDebt+" | "+amountNecessaryPayment;
    }
}

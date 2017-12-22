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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Shedule other = (Shedule) obj;
        if (date != other.date)
            return false;
        if (amountMainDebt != other.amountMainDebt)
            return false;
        if (amountNecessaryPayment != other.amountNecessaryPayment)
            return false;
        return true;
    }
}

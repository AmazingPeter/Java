package com.company;

public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit(10, 150000, 12.5);
        credit.calcNecessaryPayments();
        credit.writeIntoExcel();
    }
}

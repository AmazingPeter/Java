package com.company;

public class Main {

    public static void main(String[] args) {
	    Order order = new Order(new BreakfastFactory());
	    order.buy();
    }
}

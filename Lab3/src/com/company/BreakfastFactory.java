package com.company;

public class BreakfastFactory implements FoodFactory {
    @Override
    public BreakfastCoctail createCocktail() {
        return new BreakfastCoctail();
    }

    @Override
    public BreakfastDish createDish() {
        return new BreakfastDish();
    }
}

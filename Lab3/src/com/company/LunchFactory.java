package com.company;

public class LunchFactory implements FoodFactory {
    @Override
    public LunchCoctail createCocktail() {
        return new LunchCoctail();
    }

    @Override
    public LunchDish createDish() {
        return new LunchDish();
    }
}

package com.company;

public class Order {
    private Cocktail cocktail;
    private Dish dish;

    public Order(FoodFactory factory) {
        cocktail = factory.createCocktail();
        dish = factory.createDish();
    }

    public void buy() {
        cocktail.buy();
        dish.buy();
    }
}

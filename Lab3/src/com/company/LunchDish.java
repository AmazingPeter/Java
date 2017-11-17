package com.company;

public class LunchDish implements Dish {
    @Override
    public void buy() {
        System.out.println("Вы заказали вкусное блюдо на обед");
    }
}

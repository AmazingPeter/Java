package com.company;

import java.util.Comparator;

public class Car {
    private String name;
    private int price;
    private String shortDescription;
    public Car(String name, int price, String shortDescription) {
        this.name = name;
        this.price = price;
        this.shortDescription = shortDescription;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    @Override
    public String toString(){
        return "\n" + getName() + "; " + getPrice() + "; " + getShortDescription() + ";";
    }
    public static class PriceComparator implements Comparator<Car> {
        public int compare(Car car1, Car car2) {
            return car1.getPrice() - car2.getPrice();
        }
    }
    public static class NameComparator implements Comparator<Car> {
        public int compare(Car car1, Car car2) {
            return car1.getName().compareTo(car2.getName());
        }
    }
}

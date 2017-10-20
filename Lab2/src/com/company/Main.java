package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Porsche Panamera I 4S",2400000,
                "Beautiful and amazing car")
        );
        cars.add(new Car("Land Rover Range Rover Sport I",850000,
                "Car as car")
        );
        cars.add(new Car("Infiniti QX70", 1999000,
                "Some car")
        );
        Car.PriceComparator priceComparator = new Car.PriceComparator();
        Car.NameComparator nameComparator = new Car.NameComparator();
        System.out.println("\nDefault data: " + cars);
        cars.sort(priceComparator);
        System.out.println("\nData after sort with priceComporator: " + cars);
        cars.sort(nameComparator);
        System.out.println("\nData after sort with nameComporator: " + cars);
    }

}

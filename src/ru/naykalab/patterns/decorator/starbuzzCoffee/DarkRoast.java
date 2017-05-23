package ru.naykalab.patterns.decorator.starbuzzCoffee;


public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
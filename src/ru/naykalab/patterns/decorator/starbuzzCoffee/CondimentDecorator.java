package ru.naykalab.patterns.decorator.starbuzzCoffee;


public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();    
}
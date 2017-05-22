package ru.naykalab.patterns.decorator;


public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();    
}
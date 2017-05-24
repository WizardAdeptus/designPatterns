package ru.naykalab.patterns.factory.abstractFactory.pizza;

import ru.naykalab.patterns.factory.abstractFactory.PizzaIngredientFactory;


public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
    }

    @Override
    public void prepare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

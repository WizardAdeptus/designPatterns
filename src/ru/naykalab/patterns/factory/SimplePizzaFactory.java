package ru.naykalab.patterns.factory;


public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza Pizza = null;
        
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
    }

}
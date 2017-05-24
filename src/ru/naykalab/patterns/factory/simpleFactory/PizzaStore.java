package ru.naykalab.patterns.factory.simpleFactory;

import ru.naykalab.patterns.factory.factoryMethod.pizza.Pizza;


public class PizzaStore {
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        
        pizza = factory.createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}

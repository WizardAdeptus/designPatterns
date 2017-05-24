package ru.naykalab.patterns.factory.abstractFactory;

import ru.naykalab.patterns.factory.abstractFactory.pizza.PepperoniPizza;
import ru.naykalab.patterns.factory.abstractFactory.pizza.VeggiePizza;
import ru.naykalab.patterns.factory.abstractFactory.pizza.Pizza;
import ru.naykalab.patterns.factory.abstractFactory.pizza.CheesePizza;
import ru.naykalab.patterns.factory.abstractFactory.pizza.ClamPizza;


public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        
        return pizza;
    }

}

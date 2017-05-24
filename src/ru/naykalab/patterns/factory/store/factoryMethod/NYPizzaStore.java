package ru.naykalab.patterns.factory.store.factoryMethod;

import ru.naykalab.patterns.factory.pizza.Pizza;
import ru.naykalab.patterns.factory.pizza.ny.NYStyleCheesePizza;
import ru.naykalab.patterns.factory.pizza.ny.NYStyleClamPizza;
import ru.naykalab.patterns.factory.pizza.ny.NYStylePepperoniPizza;
import ru.naykalab.patterns.factory.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}

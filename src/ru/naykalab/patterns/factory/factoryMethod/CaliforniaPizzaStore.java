package ru.naykalab.patterns.factory.factoryMethod;

import ru.naykalab.patterns.factory.factoryMethod.pizza.california.CaliforniaStylePepperoniPizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.california.CaliforniaStyleCheesePizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.california.CaliforniaStyleVeggiePizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.california.CaliforniaStyleClamPizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.Pizza;


public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CaliforniaStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new CaliforniaStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            return new CaliforniaStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            return new CaliforniaStylePepperoniPizza();
        } else {
            return null;
        }
    }

}

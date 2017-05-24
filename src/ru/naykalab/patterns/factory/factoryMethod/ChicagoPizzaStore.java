package ru.naykalab.patterns.factory.factoryMethod;


import ru.naykalab.patterns.factory.factoryMethod.pizza.chicago.ChicagoStylePepperoniPizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.chicago.ChicagoStyleClamPizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.chicago.ChicagoStyleCheesePizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.chicago.ChicagoStyleVeggiePizza;
import ru.naykalab.patterns.factory.factoryMethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            return new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}

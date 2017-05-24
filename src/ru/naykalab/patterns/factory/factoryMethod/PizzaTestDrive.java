package ru.naykalab.patterns.factory.factoryMethod;

import ru.naykalab.patterns.factory.factoryMethod.ChicagoPizzaStore;
import ru.naykalab.patterns.factory.factoryMethod.PizzaStore;
import ru.naykalab.patterns.factory.factoryMethod.NYPizzaStore;
import ru.naykalab.patterns.factory.factoryMethod.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
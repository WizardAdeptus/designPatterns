package ru.naykalab.patterns.factory;


import ru.naykalab.patterns.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Piza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        topping.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

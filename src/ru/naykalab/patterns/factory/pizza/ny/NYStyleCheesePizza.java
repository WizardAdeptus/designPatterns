package ru.naykalab.patterns.factory.pizza.ny;


import ru.naykalab.patterns.factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Piza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        
        topping.add("Grated Reggiano Cheese");
    }
    
}
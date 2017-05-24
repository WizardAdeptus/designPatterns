package ru.naykalab.patterns.factory.abstractFactory.pizza;

import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Pepperoni;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Sauce;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Clams;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Veggies;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Cheese;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Dough;


public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    
    public abstract void prepare();
    
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slicer");
    }
    
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}

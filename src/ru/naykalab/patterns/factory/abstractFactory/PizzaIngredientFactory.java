package ru.naykalab.patterns.factory.abstractFactory;

import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Pepperoni;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Sauce;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Clams;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Veggies;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Cheese;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Dough;


public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}

package ru.naykalab.patterns.factory.abstractFactory;

import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Onion;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.ReggianoCheese;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Garlic;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.MarinaraSauce;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Mushroom;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.RedPepper;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.FreshCalms;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.ThinCrustDough;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.SlicedPepperoni;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Pepperoni;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Sauce;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Clams;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Veggies;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Cheese;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Dough;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshCalms();
    }

}

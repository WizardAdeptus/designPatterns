package ru.naykalab.patterns.factory.abstractFactory;

import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.EggPlant;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Mozzarella;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.BlackOlives;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Spinach;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.FrozenClams;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.PlumTomatoSauce;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.ThickCrusDough;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.SlicedPepperoni;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Pepperoni;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Sauce;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Clams;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Veggies;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Cheese;
import ru.naykalab.patterns.factory.abstractFactory.pizzaIngredient.Dough;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickCrusDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies vegies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return vegies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
    
}

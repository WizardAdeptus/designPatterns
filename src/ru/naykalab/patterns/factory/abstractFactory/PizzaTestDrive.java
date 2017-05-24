package ru.naykalab.patterns.factory.abstractFactory;


public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");

    }
}
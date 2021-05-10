package org.tapusd.chapterfour.pizzas;

import org.tapusd.chapterfour.factory.PizzaIngredirentFactory;

public class GreekPizza extends Pizza {

    private final PizzaIngredirentFactory pizzaIngredirentFactory;

    public GreekPizza(PizzaIngredirentFactory pizzaIngredirentFactory) {
        this.pizzaIngredirentFactory = pizzaIngredirentFactory;
        this.name = getClass().getSimpleName();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + name);
        pizzaIngredirentFactory.createDough();
        pizzaIngredirentFactory.createCheese();
        pizzaIngredirentFactory.createPeperroni();
        pizzaIngredirentFactory.createVegies();
    }

    @Override
    public void bake() {
        System.out.println(getClass().getSimpleName() + ": Put in the Oven in 108 Degree temperature");
    }

    @Override
    public void cut() {
        System.out.println(getClass().getSimpleName() + ": Cut in 6 slices");
    }

    @Override
    public void box() {
        System.out.println(getClass().getSimpleName() + ": Put in Greek Pizza box");
    }
}

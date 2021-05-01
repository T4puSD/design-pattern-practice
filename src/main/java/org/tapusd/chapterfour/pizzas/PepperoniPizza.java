package org.tapusd.chapterfour.pizzas;

import org.tapusd.chapterfour.factory.PizzaIngredirentFactory;

public class PepperoniPizza extends Pizza {
    private final PizzaIngredirentFactory ingredirentFactory;

    public PepperoniPizza(PizzaIngredirentFactory ingredirentFactory) {
        this.ingredirentFactory = ingredirentFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing -> " + name);
        dough = ingredirentFactory.createDough();
        sauce = ingredirentFactory.createSauce();
        cheese = ingredirentFactory.createCheese();
        clams = ingredirentFactory.createClams();
    }

    @Override
    public void bake() {
        System.out.println(getClass().getSimpleName() + ": Put in the Oven in 125 Degree temperature");
    }

    @Override
    public void cut() {
        System.out.println(getClass().getSimpleName() + ": Cut in 4 slices");
    }

    @Override
    public void box() {
        System.out.println(getClass().getSimpleName() + ": Put in Pepperoni Pizza box");
    }
}

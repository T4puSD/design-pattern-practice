package org.tapusd.chapterfour.pizzas;

import org.tapusd.chapterfour.factory.PizzaIngredirentFactory;

public class CheesePizza extends Pizza {
    private final PizzaIngredirentFactory ingredirentFactory;

    public CheesePizza(PizzaIngredirentFactory ingredirentFactory) {
        this.ingredirentFactory = ingredirentFactory;
        this.name = getClass().getSimpleName();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing -> " + name);
        dough = ingredirentFactory.createDough();
        sauce = ingredirentFactory.createSauce();
        cheese = ingredirentFactory.createCheese();
    }

    @Override
    public void bake() {
        System.out.println(getClass().getSimpleName() + ": Put in the Oven in 120 Degree temperature");
    }

    @Override
    public void cut() {
        System.out.println(getClass().getSimpleName() + ": Cut in 3 slices");
    }

    @Override
    public void box() {
        System.out.println(getClass().getSimpleName() + ": Put in Cheeze Pizza box");
    }
}

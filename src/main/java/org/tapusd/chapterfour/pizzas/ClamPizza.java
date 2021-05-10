package org.tapusd.chapterfour.pizzas;

import org.tapusd.chapterfour.factory.PizzaIngredirentFactory;

public class ClamPizza extends Pizza{
    private final PizzaIngredirentFactory ingredirentFactory;

    public ClamPizza(PizzaIngredirentFactory ingredirentFactory) {
        this.ingredirentFactory = ingredirentFactory;
        this.name = getClass().getSimpleName();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing -> " + name);
        dough = ingredirentFactory.createDough();
        sauce = ingredirentFactory.createSauce();
        cheese = ingredirentFactory.createCheese();
        clams = ingredirentFactory.createClams();
    }
}

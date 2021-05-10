package org.tapusd.chapterfour.pizzas;

import org.tapusd.chapterfour.factory.PizzaIngredirentFactory;

public class VeggiePizza extends Pizza{
    private final PizzaIngredirentFactory pizzaIngredirentFactory;

    public VeggiePizza(PizzaIngredirentFactory pizzaIngredirentFactory) {
        this.pizzaIngredirentFactory = pizzaIngredirentFactory;
        this.name = "Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing -> " + name);
        dough = pizzaIngredirentFactory.createDough();
        veggies = pizzaIngredirentFactory.createVegies();
        sauce = pizzaIngredirentFactory.createSauce();
    }
}

package org.tapusd.chapterfour.store;

import org.tapusd.chapterfour.pizzas.Pizza;
import org.tapusd.chapterfour.pizzas.PizzaType;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(PizzaType pizzaType);

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

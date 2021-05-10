package org.tapusd.chapterfour;

import org.tapusd.chapterfour.pizzas.Pizza;
import org.tapusd.chapterfour.pizzas.PizzaType;
import org.tapusd.chapterfour.store.NYStylePizzaStore;
import org.tapusd.chapterfour.store.PizzaStore;

public class Main {


    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("-");
        final Pizza pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println(pizza.toString());
    }
}

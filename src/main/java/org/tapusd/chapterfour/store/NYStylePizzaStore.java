package org.tapusd.chapterfour.store;

import org.tapusd.chapterfour.factory.NyPizzaIngredientFactory;
import org.tapusd.chapterfour.factory.PizzaIngredirentFactory;
import org.tapusd.chapterfour.pizzas.CheesePizza;
import org.tapusd.chapterfour.pizzas.ClamPizza;
import org.tapusd.chapterfour.pizzas.GreekPizza;
import org.tapusd.chapterfour.pizzas.PepperoniPizza;
import org.tapusd.chapterfour.pizzas.Pizza;
import org.tapusd.chapterfour.pizzas.PizzaType;
import org.tapusd.chapterfour.pizzas.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        PizzaIngredirentFactory ingredirentFactory = new NyPizzaIngredientFactory();

        switch (pizzaType) {
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredirentFactory);
                break;
            case GREEK:
                pizza = new GreekPizza();
                break;
            case CHEESE:
                pizza = new CheesePizza(ingredirentFactory);
                break;
            case CLAM:
                pizza = new ClamPizza(ingredirentFactory);
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredirentFactory);
                break;
        }

        return pizza;
    }
}

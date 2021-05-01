package org.tapusd.chapterfour.factory;

import org.tapusd.chapterfour.factory.ingredients.cheese.Cheese;
import org.tapusd.chapterfour.factory.ingredients.clams.Clams;
import org.tapusd.chapterfour.factory.ingredients.dough.Dough;
import org.tapusd.chapterfour.factory.ingredients.peperroni.Pepperoni;
import org.tapusd.chapterfour.factory.ingredients.sauce.Sauce;
import org.tapusd.chapterfour.factory.ingredients.veggies.Veggies;

public interface PizzaIngredirentFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVegies();
    Pepperoni createPeperroni();
    Clams createClams();
}

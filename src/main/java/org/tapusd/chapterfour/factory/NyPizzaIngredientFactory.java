package org.tapusd.chapterfour.factory;

import org.tapusd.chapterfour.factory.ingredients.cheese.*;
import org.tapusd.chapterfour.factory.ingredients.clams.*;
import org.tapusd.chapterfour.factory.ingredients.dough.*;
import org.tapusd.chapterfour.factory.ingredients.peperroni.*;
import org.tapusd.chapterfour.factory.ingredients.sauce.*;
import org.tapusd.chapterfour.factory.ingredients.veggies.*;

public class NyPizzaIngredientFactory implements PizzaIngredirentFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVegies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPeperroni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}

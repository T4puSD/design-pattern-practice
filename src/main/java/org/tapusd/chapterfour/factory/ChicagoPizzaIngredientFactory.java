package org.tapusd.chapterfour.factory;

import org.tapusd.chapterfour.factory.ingredients.cheese.*;
import org.tapusd.chapterfour.factory.ingredients.clams.*;
import org.tapusd.chapterfour.factory.ingredients.dough.*;
import org.tapusd.chapterfour.factory.ingredients.peperroni.*;
import org.tapusd.chapterfour.factory.ingredients.sauce.*;
import org.tapusd.chapterfour.factory.ingredients.veggies.*;


public class ChicagoPizzaIngredientFactory implements PizzaIngredirentFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVegies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPeperroni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}

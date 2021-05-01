package org.tapusd.chapterfour.pizzas;

public class NYStylePepperoniPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(getClass().getSimpleName() + ": Making dough, Cutting Cheese, Cutting pepperoni, Spreading both over the dough");
    }

    @Override
    public void bake() {
        System.out.println(getClass().getSimpleName() + ": Put in the Oven in 118 Degree temperature");
    }

    @Override
    public void cut() {
        System.out.println(getClass().getSimpleName() + ": Cut in 6 slices");
    }

    @Override
    public void box() {
        System.out.println(getClass().getSimpleName() + ": Put in NY Pepperoni Pizza box");
    }
}

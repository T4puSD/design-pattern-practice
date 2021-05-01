package org.tapusd.chapterfour.pizzas;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(getClass().getSimpleName() + ": Making dough in Greek Style");
    }

    @Override
    public void bake() {
        System.out.println(getClass().getSimpleName() + ": Put in the Oven in 108 Degree temperature");
    }

    @Override
    public void cut() {
        System.out.println(getClass().getSimpleName() + ": Cut in 6 slices");
    }

    @Override
    public void box() {
        System.out.println(getClass().getSimpleName() + ": Put in Greek Pizza box");
    }
}

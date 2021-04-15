package org.tapusd.chapterthree.starbucks.condiments;

import org.tapusd.chapterthree.starbucks.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +  ", Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.20;
    }
}

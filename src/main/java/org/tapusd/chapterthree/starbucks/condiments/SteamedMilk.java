package org.tapusd.chapterthree.starbucks.condiments;

import org.tapusd.chapterthree.starbucks.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator {

    private final Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SteamedMilk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.10;
    }
}

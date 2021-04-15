package org.tapusd.chapterthree.starbucks.condiments;

import org.tapusd.chapterthree.starbucks.beverage.Beverage;

public class Whip extends CondimentDecorator{

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.10;
    }
}

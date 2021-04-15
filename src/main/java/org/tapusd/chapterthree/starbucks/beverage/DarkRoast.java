package org.tapusd.chapterthree.starbucks.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}

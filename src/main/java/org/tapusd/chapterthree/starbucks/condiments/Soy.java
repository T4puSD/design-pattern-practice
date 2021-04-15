package org.tapusd.chapterthree.starbucks.condiments;

import org.tapusd.chapterthree.starbucks.Size;
import org.tapusd.chapterthree.starbucks.beverage.Beverage;

import java.util.Objects;

public class Soy extends CondimentDecorator{

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        if (Objects.nonNull(beverage.getSize())) {
            return beverage.getDescription() + ", Soy (" + beverage.getSize() + ")";
        }
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        double cost = beverage.getCost();
        final Size size = beverage.getSize();
        if (Objects.isNull(size)) {
            return beverage.getCost() + 0.15;
        }

        switch (size) {
            case SMALL:
                cost+= 0.10;
                break;
            case MEDIUM:
                cost += 0.15;
                break;
            case LARGE:
                cost += 0.20;
                break;
        }
        return cost;
    }
}

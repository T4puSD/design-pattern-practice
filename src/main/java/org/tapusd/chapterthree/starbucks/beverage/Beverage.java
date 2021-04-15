package org.tapusd.chapterthree.starbucks.beverage;

import org.tapusd.chapterthree.starbucks.Size;

public abstract class Beverage {

    Size size;
    String description = "This is a beverage!";

    public String getDescription() {
       return description;
    }

    public abstract double getCost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}

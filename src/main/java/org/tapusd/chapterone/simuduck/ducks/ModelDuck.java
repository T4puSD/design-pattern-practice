package org.tapusd.chapterone.simuduck.ducks;

import org.tapusd.chapterone.simuduck.flybehaviour.FlyNoWay;
import org.tapusd.chapterone.simuduck.quackbehaviour.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(getClass().getName() + " A model duck!");
    }
}

package org.tapusd.chapterone.simuduck.ducks;

import org.tapusd.chapterone.simuduck.flybehaviour.FlyNoWay;
import org.tapusd.chapterone.simuduck.quackbehaviour.Squack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehaviour = new Squack();
        this.flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println(getClass().getName() + " Looks tiny in scale and made with rubber!");
    }
}

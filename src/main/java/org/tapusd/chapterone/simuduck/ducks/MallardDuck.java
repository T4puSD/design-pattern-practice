package org.tapusd.chapterone.simuduck.ducks;

import org.tapusd.chapterone.simuduck.flybehaviour.FlyWithWings;
import org.tapusd.chapterone.simuduck.quackbehaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println(getClass().getName() + " Looks like mallard duck!");
    }
}

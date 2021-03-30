package org.tapusd.chapterone.simuduck.ducks;

import org.tapusd.chapterone.simuduck.flybehaviour.FlyWithWings;
import org.tapusd.chapterone.simuduck.quackbehaviour.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(getClass().getName() + " Looks like redhat duck!");
    }
}

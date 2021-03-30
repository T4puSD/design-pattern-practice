package org.tapusd.chapterone.simuduck.ducks;

import org.tapusd.chapterone.simuduck.flybehaviour.FlyNoWay;
import org.tapusd.chapterone.simuduck.quackbehaviour.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.quackBehaviour = new MuteQuack();
        this.flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println(getClass().getName() + " Looks like made of wood!");
    }
}

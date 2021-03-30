package org.tapusd.chapterone.simuduck.flybehaviour;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println(getClass().getName() + "Flying with wings!");
    }
}

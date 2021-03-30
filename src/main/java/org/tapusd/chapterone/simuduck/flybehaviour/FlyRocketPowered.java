package org.tapusd.chapterone.simuduck.flybehaviour;

public class FlyRocketPowered implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println(getClass().getName() + " Duck's Flying with rocket!");
    }
}

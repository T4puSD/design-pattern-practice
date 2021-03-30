package org.tapusd.chapterone.simuduck.quackbehaviour;

public class Squack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println(getClass().getName() + " Squacking!");
    }
}

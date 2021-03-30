package org.tapusd.chapterone.simuduck.quackbehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(getClass().getName() + " Actual Quack!");
    }
}

package org.tapusd.chapterone.simuduck.ducks;

import org.tapusd.chapterone.simuduck.flybehaviour.FlyBehaviour;
import org.tapusd.chapterone.simuduck.quackbehaviour.QuackBehaviour;

public abstract class Duck {
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public abstract void display();

    public void swim() {
        System.out.println(getClass().getName() + " Swimming!");
    }
    public void performFly() {
        flyBehaviour.fly();
    }
    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
